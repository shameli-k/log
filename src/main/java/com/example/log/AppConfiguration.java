package com.example.log;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppConfiguration {
    @RequestMapping("/logging")
    public String hi()
    {
        return "welcome to logging in springboot";
    }
}
/*
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class AppConfiguration {
    Logger logger= (Logger) LoggerFactory.getLogger(AppConfiguration.class);
    @RequestMapping("/hi")
    public String hi()
    {

        return "welcome to vinayagas hotel";
    }

}

 */