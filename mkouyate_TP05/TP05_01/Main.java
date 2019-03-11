import fr.umlv.fight.*;

public class Main {
     public static void main(String[] args){

   	 var d2r2 = new Robot("D2R2");
   	 var data = new Robot("data");
   	 var arena = new Arena();

     System.out.println(arena.fight(d2r2,data) + " a remporté le combat");  // affiche "Robot bob"
    
     }
}