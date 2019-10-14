import java.util.Scanner;

public class Terre {

	public static void main(String[] args) {
		int end = 0;
		Jardin jardin1 = new Jardin(3, 5);
		jardin1.ajoutePanier("Ail", 10);
		jardin1.ajoutePanier("Bettrave", 5);
		jardin1.ajoutePanier("Carotte", 5);
		jardin1.ajoutePanier("Tomate", 5);

		while (end == 0) {
			System.out.println(jardin1);
			System.out.println("Votre panier contient :");
			System.out.println("Ail = " + jardin1.getPanier().get("Ail") + " graine(s)");
			System.out.println("Bettrave = " + jardin1.getPanier().get("Bettrave") + " graine(s)");
			System.out.println("Carotte = " + jardin1.getPanier().get("Carotte") + " graine(s)");
			System.out.println("Tomate = " + jardin1.getPanier().get("Tomate") + " graine(s)");

			System.out.println("\n1- Semer une graine.");
			System.out.println("2 - Récolter les plantes qui sont matures.");
			System.out.println("3 - Passer à la saison suivante.");
			System.out.println("4 - Quitter l'application.");

			Scanner scanner = new Scanner(System.in);
			int res = scanner.nextInt();

			if (res == 1) {
				jardin1.semer();
			}
			if (res == 2) {

			}
			if (res == 3) {

			}
			if (res == 4) {
				System.out.println("Vous quittez votre jardin");
				end = 1;
			}
		}
	}
}
