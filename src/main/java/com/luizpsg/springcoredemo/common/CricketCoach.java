package com.luizpsg.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope("prototype")
public class CricketCoach implements Coach {

  @Override
  public String getDailyWorkout() {
    return "Practice fast bowling for 15 minutes.";
  }

}
