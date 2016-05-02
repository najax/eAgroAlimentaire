package com.miage.projet.dao;

import java.util.List;

import com.miage.projet.entities.*;

public interface IDaoManager {

	   public Long ajouterFournisseur(Fournisseur Fo); 
	   public List<Fournisseur> listFournisseur();
	   public void supprimerFournisseur(Long idFour);
	
	   public Long ajouterLot(LotAliments la);
	   
	   public void supprimerLot(Long idLot);
	   public List<Aliment> listAliments();
	   public Aliment getAliment(Long idAliment);
	   public void supprimerAliment(Long idAliment);
	   public void modifierAliment(Aliment a);
	   public LotAliments getLotAliments(Long idLot);
	   public long  ajouterAliment(Aliment a);
	   
	   public Long ajouterLotP(LotPlats lp);
	   public void supprimerLotP(Long idPlat);
	   public Long ajouterPlat(Plat p); 
	   public List<Plat> listPlats();
	   public List<LotPlats> listLotPlats();
	   public Plat getPlat(Long idPlat);
	   public void modifierPlat(Plat p);
	   public void supprimerPlat(Long idPlat);
	   
	   public void ajouterUser(User u);
	   public void modifierPrixPlat(double prix,Plat p);
	  
	   
}