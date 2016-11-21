package by.springboot;

import by.springboot.dao.TeamRepository;
import by.springboot.model.Player;
import by.springboot.model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.HashSet;

@SpringBootApplication
public class SpringBootLab1Application {

    @Autowired
    private TeamRepository teamRepository;

    @PostConstruct
    public void init() {
        teamRepository.save(Arrays.asList(

              new Team("Globetrotters", "Harlem", new HashSet<>(
                        Arrays.asList(new Player("John Salanski", "defender"), new Player("Robert Hopkins", "catcher")))
              ),
              new Team("Generals", "Washington", new HashSet<>(
                        Arrays.asList(new Player("Vasiliy Hamskiy", "forward"), new Player("Rakesh Balamathtrapia", "catcher")))
              ))
        );
    }

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLab1Application.class, args);
	}
}
