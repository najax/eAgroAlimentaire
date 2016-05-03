package com.miage.projet.metier;

import com.miage.projet.entities.Plat;


public interface IFinancierMetier extends IFabrMetier {

	
	public void calculerPrixPlat(float indice, Plat p) ;

}
