package fr.umlv.fight;

import java.util.Objects;


public class Robot {
  protected String name = "<anonymous>";
  protected int life = 10;

  public Robot (String name) {
  	this.name=name;
  }

  public void fire(Robot enemy) {
    if (enemy.isDead()) throw new NullPointerException( name + " can't hit a dead robot");

    if (rollTheDice()) {
      enemy.hit();
      System.out.println("Robot " + enemy.getName() + " a été touché par " + name +" !");     
    } else {
    System.out.println(name + " a manqué " + enemy.getName() + " !");     
    }
  }

  protected boolean rollTheDice() {
    return true;
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