package com.luizpsg.springcoredemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.luizpsg.springcoredemo.common.Coach;
import com.luizpsg.springcoredemo.common.SwimCoach;

@Configuration
public class SportConfig {

   //configure the Bean

   @Bean("aquatic")
   public Coach swimCoach() {
     return new SwimCoach();
   }

}
