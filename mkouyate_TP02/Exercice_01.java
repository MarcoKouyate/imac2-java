      /*KOUYATE Marco - IMAC 2*/
      /*JAVA - 2019*/
      /*TP 2 - Exercice 1 - Assignation, égalité, référence*/



      public class Exercice_01 {
        public static void main(String[] args) {
            var s8 = "hello";
            s8.toUpperCase();
            System.out.println(s8.toUpperCase());
        }
      }


       /*Quel est le type de 's' ?*/
       		//var est une chaine de caractères

       /*Comment le compilateur fait il pour savoir qu'il existe une méthode length() sur 's' ?*/
       		//le compilateur sait qu'il existe une méthode length() pour les chaines de caractère


       /* Qu'affiche le code suivant ? 
	       var s1 = "toto";
	       var s2 = s1;
	       var s3 = new String(s1);

	       System.out.println("s1 == s2 :");
	       System.out.println(s1 == s2);
	       System.out.println("s1 == s3 :");
	       System.out.println(s1 == s3);

       		Expliquez*/
                  //Les variables s1 et s2 sont toutes les deux de simples chaines de caractères. Nous pouvons les comparer directement
                  //La variable s3 est un objet de type String auquel nous avons passé une chaine de caractère en argument. L'opérateur == ne fonctionne pas pour vérifier l'égalité entre les contenus de ces objets. 



       /*Quelle est la méthode à utiliser si l'on veut tester si le contenu des chaînes de caractères est le même ?*/
		       //On utilise la méthode equals() sur une variable en passant l'autre variable en argument. Cela returne true si le contenu est identique.
		       //System.out.println(s4.equals(s5));


       /*Qu'affiche le code suivant ?
      var s6 = "toto";
      var s7 = "toto";
      System.out.println(s6 == s7);
     
	  Expliquer.*/
	  		//le code affiche true puisque les deux variables sont de simples chaines de caractères. Contrairement à l'objet String vu précédemment, nous pouvons directement les comparer.  

	  /*Expliquer pourquoi il est important que java.lang.String ne soit pas mutable.*/
                  //Cela permet à Java de mieux gérer la memoire allouee aux instances crees dans le String Pool. Puisque plusieurs variables possédant le même chaine de caractères sont en fait des
                  //références sur le même objet String, il est impossible de modifier cette instance sans provoquer de modifications chez les autres.

	  /*Qu'affiche le code suivant ?
      var s8 = "hello";
      s8.toUpperCase();
      System.out.println(s8);
     
		Expliquer.*/
                  //la methode toUpperCase() ne transforme pas la chaine de caractère. Elle renvoie juste une copie de la chaine de caractère en majuscule. Pour afficher s8 en majuscule, il faudrait
                  //stocker ce que renvoie cette methode dans une nouvelle variable ou bien directement l'utiliser dans System.out.println(s8.toUpperCase());