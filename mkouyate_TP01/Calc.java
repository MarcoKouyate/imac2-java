/*

    Pourquoi nextInt() n'est pas une fonction ?
    Qu'est nextInt() alors ? 
    	- nextInt() est une méthode de Scanner
    Expliquer la ligne : import java.util.Scanner
    	- importe l'interface permettant de scanner les chaines de caractères
         

    Modifier le programme pour qu'il demande deux entiers et affiche la somme de ceux-ci.
    Afficher en plus de la somme, la différence, le produit, le quotient et le reste.

*/


import java.util.Scanner; 

public class Calc { 
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Saisissez le premier nombre: ");
		int value1 = scanner.nextInt();
		System.out.println("Saisissez le second nombre: ");
		int value2 = scanner.nextInt(); 
		


		System.out.println("value1 : ");
		System.out.println(value1);
		System.out.println("value2 : ");
		System.out.println(value2);

		System.out.println("value1 + value2 = ");
		System.out.println(value1+value2);

		System.out.println("value1 - value2 = ");
		System.out.println(value1-value2);

		System.out.println("value1 x value2 = ");
		System.out.println(value1*value2);

		System.out.println("value1 / value2 = ");
		System.out.println((float)value1/(float)value2);

		System.out.println("value1 % value2 = ");
		System.out.println(value1%value2);
	}
}