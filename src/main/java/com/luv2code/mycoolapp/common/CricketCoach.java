package com.luv2code.mycoolapp.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public CricketCoach (){
        System.out.println("In constructor:" + getClass().getSimpleName());
    }
@Override
        public String getCoachDetails(){
        return "Coach is MSD......!";
    }
}
