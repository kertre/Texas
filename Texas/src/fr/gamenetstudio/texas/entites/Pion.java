package fr.gamenetstudio.texas.entites;

public class Pion {

	private int numero ;
	
	private Case laCase ;
	private Joueur leJoueur ;
	
	public Pion(int numero, Case laCase, Joueur leJoueur) {
		super();
		this.numero = numero;
		this.laCase = laCase;
		this.leJoueur = leJoueur;
		
		this.laCase.setLePion(this) ;
	}
	
	public Pion(int numero, Joueur leJoueur) {
		super();
		this.numero = numero;
		this.leJoueur = leJoueur;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Case getLaCase() {
		return laCase;
	}

	public void setLaCase(Case laCase) {
		this.laCase = laCase;
	}

	public Joueur getLeJoueur() {
		return leJoueur;
	}

	public void setLeJoueur(Joueur leJoueur) {
		this.leJoueur = leJoueur;
	}
	
	public boolean estPlace(){
		if( this.laCase != null ){
			return true ;
		}
		else {
			return false ;
		}
	}
	
}
