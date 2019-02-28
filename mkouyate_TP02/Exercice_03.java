/*  Le but de cet exercice est la manipulation d'expressions régulières en java. Nous utiliserons pour cela les classes du paquetage java.util.regex. */

	/*A quoi servent la classe java.util.regex.Pattern et sa méthode compile ? */
		// La classe java.util.regex.Pattern consiste en une version compilée d'une expression régulière. Sa méthode compile l'expression régulière donnée en un motif.
	
	/*A quoi sert la classe java.util.regex.Matcher ?*/
		//La classe Matcher (java.util.regex.Matcher) est utilisée pour trouver plusieurs occurences d'une expression régulière au sein d'un texte. 

	
	/*Écrire un programme qui lit des chaînes de caractères sur la ligne de commande et affiche les chaînes qui correspondent à des nombres, 
	  c'est-à-dire les chaînes dont tous les caractères sont compris entre '0' et '9'.*/
	
	/*Modifier le programme pour que, si une chaîne de caractères commence par des caractères qui ne sont pas des chiffres, 
	 ces chiffres soient également affichés (par exemple, avec les chaînes "abc", "ab3", "4de", "f6h" et "789", on affiche : "3 789").*/
	
	/*Écrire une méthode qui prend en paramètre une chaîne de caractères contenant une adresse IPv4 et renvoie un tableau de 4 bytes. 
	Il faut tester qu'il s'agit bien d'une adresse valide.*/ 
	
	/*Vous utiliserez pour cela la notion de groupe.*/

	import java.util.regex.Pattern;
	import java.util.regex.Matcher;


      class Exercice_03 {
        public static void main(String[] args) {
            System.out.println("Command-line arguments:");

             String text = "";





            for (String arg : args) {

                  text += arg;
                  text += ' ';

            }

            System.out.println(text);

            String patternString = ".*0.*";

        	Pattern pattern = Pattern.compile(patternString);

        	Matcher matcher = pattern.matcher(text);
        }
      }