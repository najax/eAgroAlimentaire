package com.miage.projet.metier;

import java.util.List;

import com.miage.projet.entities.LotPlats;
import com.miage.projet.entities.Plat;

public interface IFabrMetier extends IAproviMetier{
	  public Long ajouterLotP(LotPlats lp);
	   public void supprimerLotP(Long idPlat);
	   public Long ajouterPlat(Plat p); 
	   public List<Plat> listPlats();
	   public List<LotPlats> listLotPlats();
	   public Plat getPlat(Long idPlat);
	   public void modifierPlat(Plat p);
	   public void supprimerPlat(Long idPlat);
	   

}
