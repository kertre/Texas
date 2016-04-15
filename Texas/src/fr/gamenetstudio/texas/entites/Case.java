package fr.gamenetstudio.texas.entites;

public class Case {

	private int ligne ;
	private int colonne ;
	
	private Pion lePion ;

	public Case(int ligne, int colonne) {
		super();
		this.ligne = ligne;
		this.colonne = colonne;
	}

	public int getLigne() {
		return ligne;
	}

	public void setLigne(int ligne) {
		this.ligne = ligne;
	}

	public int getColonne() {
		return colonne;
	}

	public void setColonne(int colonne) {
		this.colonne = colonne;
	}

	public Pion getLePion() {
		return lePion;
	}

	public void setLePion(Pion lePion) {
		this.lePion = lePion;
	}

	@Override
	public String toString() {
		return "Case [ligne=" + ligne + ", colonne=" + colonne + "]";
	}
	
}
