package com.spring.security.demospringsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
public class SecurityController {

    //Consumer or Client present in external repository "springboot-practice"
    //Client class is SpringBasicAuthAccessController.java

    Logger logger = Logger.getLogger(this.getClass().getName());
    @GetMapping("/user")
    public String getUser(){
              logger.log(Level.INFO, "getUser");
        return "<H1>Hello user</H1>"+"<br>"+"<H1>Welcome!!!</H1>";
    }


}
