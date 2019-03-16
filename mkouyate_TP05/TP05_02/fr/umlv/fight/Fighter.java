package fr.umlv.fight;

import java.util.Objects;
import java.util.Random;


public class Fighter extends Robot {

  final static Random randomno = new Random();

  public Fighter(String name){
    super(name);
  }
  
  @Override protected boolean rollTheDice() {
  	return randomno.nextBoolean();
  }


  @Override public String toString(){
     return "Fighter " + name;
  }  
}