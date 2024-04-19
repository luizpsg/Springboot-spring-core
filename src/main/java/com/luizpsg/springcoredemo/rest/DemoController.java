package com.luizpsg.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luizpsg.springcoredemo.common.Coach;


@RestController
public class DemoController {
  
  //define a private field for the dependency
  private Coach myCoach;

  public DemoController() {
  }

  // @Autowired
  // public void anyMethodName(Coach theCoach) {
  //   myCoach = theCoach;
  // }

  @Autowired
  public void setCoach(Coach theCoach) {
    myCoach = theCoach;
  }

  @GetMapping("/dailyworkout")
  public String getDailyWorkout() {
    return myCoach.getDailyWorkout();
  }
}
