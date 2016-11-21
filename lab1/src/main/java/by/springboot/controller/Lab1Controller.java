package by.springboot.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by dzmitry on 11/13/16.
 */
@Controller
public class Lab1Controller {

    private static final Logger logger = Logger.getLogger(Lab1Controller.class);

    @RequestMapping("/")
    public String sampleMethod() {
        logger.info("logger test45!");
        return "hello";
    }
}
