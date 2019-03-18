package fr.umlv.fight;

//import java.util.Objects;


public class Fighter extends Robot {

  public Fighter(String name){
    super(name);
  }
  
  @Override public String toString(){
     return "Fighter " + name;
  }  
}