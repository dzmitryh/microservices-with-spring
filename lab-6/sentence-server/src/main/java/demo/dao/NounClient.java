package demo.dao;

import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Created by dzmitry on 12/11/16.
 */
@FeignClient("nounService")
public interface NounClient {}
