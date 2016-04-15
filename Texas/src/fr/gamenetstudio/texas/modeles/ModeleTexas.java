package fr.gamenetstudio.texas.modeles;

import fr.gamenetstudio.texas.entites.Case;
import fr.gamenetstudio.texas.entites.CaseEtang;
import fr.gamenetstudio.texas.entites.CaseRanch;
import fr.gamenetstudio.texas.entites.CaseRiviere;
import fr.gamenetstudio.texas.entites.CaseVille;

public class ModeleTexas {

	public static final int NB_LIGNES = 20 ;
	public static final int NB_COLONNES = 18 ;
	
	private static ModeleTexas modele = null ;
	
	private Case [][] plateau = new Case[NB_LIGNES][NB_COLONNES] ;
	
	private ModeleTexas(){
		super() ;
		this.peupler() ;
	}
	
	public static ModeleTexas getModeleTexas(){
		if( ModeleTexas.modele == null ){
			ModeleTexas.modele = new ModeleTexas() ;
		}
		return ModeleTexas.modele ;
	}
	
	private void peupler(){
		
		// Les ranchs
		plateau[0][9] = new CaseRanch(0, 9) ;
		plateau[17][10] = new CaseRanch(17, 10) ;
		
		// La ville
		plateau[8][9] = new CaseVille(8, 9) ;
		plateau[8][10] = new CaseVille(8, 10) ;
		plateau[9][9] = new CaseVille(9, 9) ;
		plateau[9][10] = new CaseVille(9, 10) ;
		
		// Les étangs
		
		plateau[12][3] = new CaseEtang(12, 3) ;
		plateau[12][4] = new CaseEtang(12, 4) ;
		plateau[13][3] = new CaseEtang(13, 3) ;
		plateau[13][4] = new CaseEtang(13, 4) ;
		
		plateau[1][16] = new CaseEtang(1, 16) ;
		plateau[1][17] = new CaseEtang(1, 17) ;
		plateau[2][16] = new CaseEtang(2, 16) ;
		plateau[2][17] = new CaseEtang(2, 17) ;
		
		// La rivière
		
		plateau[7][0] = new CaseRiviere(7, 0) ;
		plateau[7][1] = new CaseRiviere(7, 1) ;
		plateau[7][2] = new CaseRiviere(7, 2) ;
		plateau[6][2] = new CaseRiviere(6, 2) ;
		plateau[5][2] = new CaseRiviere(5, 2) ;
		plateau[4][2] = new CaseRiviere(4, 2) ;
		
		for( int numLigne = 0 ; numLigne < NB_LIGNES ; numLigne++ ){
			for( int numColonne = 0 ; numColonne < NB_COLONNES ; numColonne++ ){
				
				if( plateau[numLigne][numColonne] == null ){
					System.out.println(numLigne + "," + numColonne) ;
					plateau[numLigne][numColonne] = new Case(numLigne,numColonne) ;
				}
			}
		}
		
	}
	
}
