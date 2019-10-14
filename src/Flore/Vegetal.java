package Flore;

public abstract class Vegetal {
	protected Etat etat;
	public static char dessin[];

	public Vegetal() {
		// TODO Auto-generated constructor stub
		dessin = new char[6];
		dessin[0] = '_';
		dessin[1] = '.';
		dessin[2] = '|';
		dessin[5] = '#';

		this.etat = Etat.GRAINE;

	}

	public static char tochar() {

		return dessin[0];
	}
	public void grandir()
	{
		this.etat = Etat.values()[this.etat.ordinal()+1];
	}
}
