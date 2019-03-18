import fr.umlv.fight.*;

public class Main {
     public static void main(String[] args){

   	 var d2r2 = new Robot("D2R2");
   	 var data = new Robot("data");
   	 var arena = new Arena();

   	 var djayd = new Fighter("Djayd");
   	 var cod = new Fighter("Cod");

     System.out.println(arena.fight(cod,djayd) + " a remporté le combat");  // affiche "Robot bob"

     }
}