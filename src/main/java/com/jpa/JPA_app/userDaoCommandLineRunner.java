package com.jpa.JPA_app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.jpa.JPA_app.Entity_pac.User;
import com.jpa.JPA_app.Service_pac.UserService;

@Component
public class userDaoCommandLineRunner implements CommandLineRunner {
    @Autowired
    UserService services;
    
    private static final Logger log = LoggerFactory.getLogger(userDaoCommandLineRunner.class);
    
    @Override
    public void run(String... args) throws Exception {
        User user = new User("ikori","Admin");
        Long insert = services.insert(user);

        log.info("user :"+insert);
        
    }
    
}
