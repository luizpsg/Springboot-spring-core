package com.luizpsg.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luizpsg.springcoredemo.common.Coach;


@RestController
public class DemoController {
  
  //define a private field for the dependency
  private Coach myCoach;

  private Coach anotherCoach;

  public DemoController() {
  }

  //define a constructor for dependency injection
  // @Autowired
  // public DemoController(@Qualifier("trackCoach") Coach theCoach) {
  //   myCoach = theCoach;
  // }


  //USING @Primary
  @Autowired
  public DemoController(Coach theCoach, Coach theAnotherCoach) {
    myCoach = theCoach;
    anotherCoach = theAnotherCoach;
  }

  @GetMapping("/dailyworkout")
  public String getDailyWorkout() {
    return myCoach.getDailyWorkout();
  }

  @GetMapping("/check")
  public String check() {
    return "Comparing beans: myCoach == anotherCoach, " + (myCoach == anotherCoach);
  }
}
