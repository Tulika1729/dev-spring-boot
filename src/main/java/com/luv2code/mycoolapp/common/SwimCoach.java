package com.luv2code.mycoolapp.common;

public class SwimCoach implements Coach {

    public SwimCoach(){
        System.out.println("In Constructor:"+ getClass().getSimpleName());
    }
    @Override
    public String getCoachDetails(){
        return "Swim Coach";
    }
}
