package com.luv2code.mycoolapp.rest;

import com.luv2code.mycoolapp.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Field;

@RestController
public class DemoController {

    /*Field Injection is not recommended by spring.io development team
      As it makes the code harder to unit test
    */

//    @Autowired
//    private Coach myCoach;


    //Define a private field for the dependency
    private Coach myCoach;
    private Coach anotherCoach;

    //  define a constructor for constructor dpendency  injection
    // when multiple beans are available, qualifier annotation is used to specify bean Id
    // here bean id is same as class , first char lower case
    // same for both constructor and setter injection
//    @Autowired
//    public DemoController(
//            @Qualifier("footballCoach") Coach ch,
//            @Qualifier("footballCoach") Coach ach){
//        System.out.println("In constructor:" + getClass().getSimpleName());
//        myCoach = ch;
//        anotherCoach = ach;
//    }
    @Autowired
    public DemoController(
            @Qualifier("swimCoach") Coach ch){
        System.out.println("In constructor:" + getClass().getSimpleName());
        myCoach = ch;
    }


//    //method for setter injection
//    //we can give any method name instead of setCoach, as Spring searches for @Autowired for dependency injection
//    @Autowired
//    public void setCoach(Coach ch){
//        myCoach = ch;
//    }

    @GetMapping("/coachDetails")
    public String getCoachDetails(){
        return myCoach.getCoachDetails();
    }

    @GetMapping("/checkBeanType")
    public String getBeanType(){
        return ("Is myCoach == anotherCoach? :" + (myCoach == anotherCoach));
    }
}

