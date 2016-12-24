package demo.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import demo.dao.*;
import demo.domain.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WordServiceImpl implements WordService {

	@Autowired VerbClient verbClient;
	@Autowired SubjectClient subjectClient;
	@Autowired ArticleClient articleClient;
	@Autowired AdjectiveClient adjectiveClient;
	@Autowired NounClient nounClient;


    @HystrixCommand(fallbackMethod = "getSubjectFallback")
	@Override
	public Word getSubject() {
		return subjectClient.getWord();
	}

	public Word getSubjectFallback() {
		return new Word("Someone");
	}
	
	@Override
	public Word getVerb() {
		return verbClient.getWord();
	}
	
	@Override
	public Word getArticle() {
		return articleClient.getWord();
	}

	@HystrixCommand(fallbackMethod = "getAdjectiveFallback")
	@Override
	public Word getAdjective() {
		return adjectiveClient.getWord();
	}

	public Word getAdjectiveFallback() {
		return new Word("");
	}

	
	@Override
	public Word getNoun() {
		return nounClient.getWord();
	}	
}
