import java.util.HashMap;
import java.util.Scanner;

import Flore.Ail;
import Flore.Betterave;
import Flore.Carotte;
import Flore.Tomate;
import Flore.Vegetal;

public class Jardin {

	private int longueur;
	private int largeur;
	private Emplacement emplacement[][];
	private HashMap<String, Integer> panier;

	public Jardin(int lon, int lar) {

		this.longueur = lon;
		this.largeur = lar;
		this.panier = new HashMap<String, Integer>();
		emplacement = new Emplacement[longueur][largeur];
	}

	public int getLongueur() {
		return longueur;
	}

	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}

	public int getLargeur() {
		return largeur;
	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}

	public HashMap<String, Integer> getPanier() {
		return panier;
	}

	public void setPanier(HashMap<String, Integer> panier) {
		this.panier = panier;
	}

	public void ajoutePanier(String vege, int q) {
		this.panier.put(vege, q);

	}

	@Override
	public String toString() {
		String texte = "Voici votre jardin \n";

		for (int x = 0; x < longueur; x++) {
			for (int y = 0; y < largeur; y++) {
				if (emplacement[x][y] == null) {
					texte += 'o';
				} else {
					texte += Vegetal.tochar();
				}
			}
			texte += "\n";
		}

		return texte;
	}

	public void semer() {
		System.out.println("Sur quel emplacement (x puis y) souhaitez-vous planter votre graine ? ");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		System.out.println("Que souhaitez vous planter ?");
		System.out.println("Une graine d'ail");
		System.out.println("Une graine de bettrave");
		System.out.println("Une graine de carotte ");
		System.out.println("Une graine de tomate");
		int choix = scanner.nextInt();
		if (choix == 1) {
			this.emplacement[x][y] = new Emplacement(new Ail());
		}
		if (choix == 2) {
			this.emplacement[x][y] = new Emplacement(new Betterave());
		}
		if (choix == 3) {
			this.emplacement[x][y] = new Emplacement(new Carotte());
		}
		if (choix == 4) {
			this.emplacement[x][y] = new Emplacement(new Tomate());
		}
	}

	public void saisonSuivant() {
		for (int x = 0; x < longueur; x++) {
			for (int y = 0; y < largeur; y++) {
				this.emplacement[x][y].getVegetal().grandir();
		}
	}
	}
}
