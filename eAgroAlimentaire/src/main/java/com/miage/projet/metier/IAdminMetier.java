package com.miage.projet.metier;

import com.miage.projet.entities.Plat;
import com.miage.projet.entities.User;

public interface IAdminMetier extends IFinancierMetier{

	   public void modifierPrixPlat(double prix,Plat p);
	   public void ajouterUser(User u);
}
