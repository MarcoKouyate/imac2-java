package fr.umlv.fight;

import java.util.Objects;


public class Robot {
  private String name = "<anonymous>";
  private int life = 10;

  public Robot (String name) {
  	this.name=name;
  }
  
  @Override public String toString(){
     return "Robot " + name;
  }  
}