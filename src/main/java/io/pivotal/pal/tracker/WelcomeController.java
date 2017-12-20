package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {


    private String message ;

    public WelcomeController(@Value("${WELCOME_MESSAGE}") String envMessage){
        this.message = envMessage;
    }



    @GetMapping("/")
    public String sayHello() {
        return message;
    }


}