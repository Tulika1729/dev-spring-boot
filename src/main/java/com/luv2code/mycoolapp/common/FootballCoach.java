package com.luv2code.mycoolapp.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class FootballCoach implements Coach {

    public FootballCoach (){
        System.out.println("In constructor:" + getClass().getSimpleName());
    }

//    //define our init method
//    @PostConstruct
//    public void doMyStuff(){
//        System.out.println("Post Construct:"+ getClass().getSimpleName());
//    }
//
//    //define our destroy method
//    @PreDestroy
//    public void doCleanUpStuff(){
//        System.out.println("Pre Destruct:"+ getClass().getSimpleName());
//    }

    @Override
    public String getCoachDetails(){
        return "Sunil Chetri";
    }
}
