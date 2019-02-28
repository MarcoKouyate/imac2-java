
/*Écrire une classe PrintArgs qui affiche les arguments de la ligne de commande.

      $ java PrintArgs Voici des arguments
      Voici
      des
      arguments
    

Les arguments de la ligne de commande sont stockés dans le tableau de chaînes de caractères passé en argument à la méthode public static void main(String[] args).

    Dans un premier temps, afficher le premier argument de la ligne de commande (dans notre exemple Voici).
    Que se passe-t'il si l'on ne passe pas d'argument lors de l'exécution du programme ?
    Écrire une boucle affichant le contenu du tableau en sachant qu'en Java les tableaux possèdent un champ (un attribut) length qui renvoie la taille du tableau.
    Changer votre programme pour utiliser la syntaxe dite 'foreach' for(Type value: array)*/

      public class PrintArgs {
        public static void main(String[] args) {
            System.out.println("Command-line arguments:");

            for (String arg : args) {

                  System.out.println(arg);

            }
        }
      }