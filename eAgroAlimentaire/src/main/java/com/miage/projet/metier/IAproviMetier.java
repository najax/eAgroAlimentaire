package com.miage.projet.metier;

import java.util.List;

import com.miage.projet.entities.Aliment;
import com.miage.projet.entities.Fournisseur;
import com.miage.projet.entities.LotAliments;

public interface IAproviMetier {
	
	public Long ajouterLot(LotAliments la);
	public void supprimerLot(Long idLot);
	public Aliment getAliment(Long idAliment);
	public void supprimerAliment(Long idAliment);
	public void modifierAliment(Aliment a);
	public LotAliments getLotAliments(Long idLot);
	Long ajouterAliment(Aliment a);
	Long ajouterFournisseur(Fournisseur Fo);
	List<Fournisseur> listFournisseur();
	void supprimerFournisseur(Long idFour);
	List<Aliment> listAliments();
	
}
