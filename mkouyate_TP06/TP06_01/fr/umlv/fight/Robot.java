package fr.umlv.fight;

import java.util.Objects;


public class Robot {
  protected String name = "<anonymous>";
  protected int life = 10;

  public Robot (String name) {
  	this.name=name;
  }

  public void fire(Robot enemy) {
  	enemy.hit();
  	 System.out.println("Robot " + enemy.getName() + " a été touché par " + name +" !");
  }

  public void hit(){
  	life = life-2;
  }

  public String getName(){
  	return name;
  }

  public boolean isDead (){
  	return (life <= 0 ) ? true : false;
  }
  
  @Override public String toString(){
     return "Robot " + name;
  }  
}