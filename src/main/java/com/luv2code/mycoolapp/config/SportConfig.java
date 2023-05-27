package com.luv2code.mycoolapp.config;

import com.luv2code.mycoolapp.common.Coach;
import com.luv2code.mycoolapp.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    //bean will be created with this name swimCoach
    // but we can use anyOther name to create bean
    @Bean
        public Coach swimCoach(){
            return new SwimCoach();
    }
}
