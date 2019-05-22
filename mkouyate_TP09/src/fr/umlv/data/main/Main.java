package fr.umlv.data.main;
import fr.umlv.data.LinkedLink;

public class Main {

	public static void main(String[] args) {
		LinkedLink<String> chaine = new LinkedLink<String>("Naruto");
		chaine.add("Marcito");
		chaine.add("John");
		System.out.println("Hellossu world !");
		System.out.println(chaine);
		System.out.println("Current value 2 : " + chaine.getIndex(1).length());
	}

}
