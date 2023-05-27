package com.luv2code.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    //inject properties for coach.name and team.name
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/teamInfo")
    public String teamDetails(){
        return "coach:" + " " + coachName + " team:" +" "+ teamName;
    }


    //expose "/" that return hello world
    @GetMapping("/tulika")
    public String sayHello() {
        return "Hello people!";
    }
}
