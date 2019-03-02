/*On souhaite écrire un programme affichant la somme d'entiers pris en paramètres sur la ligne de commande.
Voici un exemple d'exécution :

 	$ java Sum 15 5 231
 	integers: 15 5 231
 	sum: 251
   


Ce programme est décomposé en plusieurs fonctions :

    Écrire une méthode qui prend un tableau de chaînes de caractères en argument et renvoie un tableau d'entiers de même taille contenant les entiers issus des chaînes de caractères.
    La méthode statique parseInt(String s) de la classe java.lang.Integer permet de récupérer la valeur d'un entier stockée dans une chaîne de caractères.
    Que veut dire statique pour une méthode ?
    Que se passe-t'il lorsqu'un mot pris en argument n'est pas un nombre ?
    Écrire une méthode qui prend un tableau d'entiers en argument et renvoie la somme de ceux-ci.
    Écrire la méthode main qui utilise les deux méthodes précédentes pour afficher le tableau d'entiers ainsi que sa somme.
    Il y a un petit piège pour afficher les tableaux vous pouvez vous aider de la classe java.util.Arrays. */
      
 import java.util.Arrays; 

      public class Sum {

		     public static void main(String[] args) {
		     	
		     	int[] numbers = convertStringToInt(args);

		     	System.out.println("Les différents arguments sont : ");
		     	System.out.println(Arrays.toString(numbers));
		     	
		     	int total = sumFromArray(numbers);
		     	System.out.println("La somme des arguments est : ");
		     	System.out.println(total);
		     }

            public static int[] convertStringToInt(String[] chaines){
            	int[] entiers = new int[chaines.length];
            	int i=0;
            	for (String chaine : chaines) {
                  entiers[i] = Integer.parseInt(chaine);
                  i++;	
            	}

            	return entiers;
            }

            public static int sumFromArray(int[] entiers){
            	int sum = 0;
            	for (int entier : entiers) {
                  sum += entier;
            	}

            	return sum;
            }            
      
      }