/*Écrire une classe fr.umlv.morse.Morse qui permet, lors de son exécution, d'afficher les chaînes de caractères prises en argument séparées par des "Stop.".
      $ java Morse ceci est drole
      ceci Stop. est Stop. drole Stop.
Utiliser dans un premier temps l'opérateur + qui permet la concaténation de chaînes de caractères.
*/

/*
      class Morse {
        public static void main(String[] args) {
            System.out.println("Command-line arguments:");

            var chaine = "";


            for (String arg : args) {

                  chaine += arg;
                  chaine += " Stop. ";

            }

            System.out.println(chaine);
        }
      }
*/

/*A quoi sert l'objet java.lang.StringBuilder ? */

  //Cela permet de créer une séquence de chaines de caractères mutable, ce qui nous autoriser à pouvoir la modifier par la suite.

/*Pourquoi sa méthode append(String) renvoie-t-elle un objet de type StringBuilder ?*/
  
  //Cela permet de modifier la séquence de chaines de caractères sur laquelle nous utilisons la méthode sans en créer une autre qui soit immutable

/*Réécrire la classe fr.umlv.morse.Morse en utilisant un StringBuilder. */

      /*class Morse {
        public static void main(String[] args) {
            System.out.println("Command-line arguments:");

            StringBuilder str = new StringBuilder("");


            for (String arg : args) {

                  str.append(arg);
                  str.append(" Stop. ");

            }

            System.out.println(str);
        }
      }*/

/*Quel est l'avantage par rapport à la solution précédente ?*/


/*Recopier le code suivant dans une classe de Test :*/

      class Morse {
         public static void main(String[] args) {
           var first = args[0];
           var second = args[1];
           var last = args[2];
           System.out.println(first + ' ' + second + ' ' + last);
         }
      }       


      
/*Pourquoi peut-on utiliser ' ' à la place de " " ? */
      //Les espaces étant simples, nous pouvons utiliser les ' ' comme pour tout autre char

/*Compiler le code puis utiliser la commande javap pour afficher le bytecode Java (qui n'est pas un assembleur) généré.
       javap -c Test
      
Que pouvez-vous en déduire ?
Compiler le code de la question 1, puis utiliser la commande javap pour afficher le bytecode Java généré. 
Que pouvez-vous en déduire ? 
Dans quel cas doit-on utiliser StringBuilder.append() plutôt que le + ? 
Et pourquoi est-ce que le chargé de TD va me faire les gros yeux si j'écris un + dans un appel à la méthode append?*/
