package com.spring.security.demospringsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
public class SecurityController {

    Logger logger = Logger.getLogger(this.getClass().getName());
    @GetMapping("/user")
    public String getUser(){
              logger.log(Level.INFO, "getUser");
        return "user";
    }


}
