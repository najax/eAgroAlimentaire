package com.miage.projet.metier;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.miage.projet.dao.IDaoManager;
import com.miage.projet.entities.Aliment;
import com.miage.projet.entities.Fournisseur;
import com.miage.projet.entities.LotAliments;
import com.miage.projet.entities.LotPlats;
import com.miage.projet.entities.Plat;
import com.miage.projet.entities.User;
@Transactional
public class MetierImpl implements IAdminMetier{

	IDaoManager dao;
	
	@Override
	public Long ajouterLot(LotAliments la) {
		// TODO Auto-generated method stub
		return dao.ajouterLot(la);
	}

	@Override
	public void supprimerLot(Long idLot) {
		// TODO Auto-generated method stub
		dao.supprimerLot(idLot);
		
	}

	public void setDao(IDaoManager dao) {
		this.dao = dao;
	}

	@Override
	public Aliment getAliment(Long idAliment) {
		// TODO Auto-generated method stub
		return dao.getAliment(idAliment);
	}

	@Override
	public void supprimerAliment(Long idAliment) {
		// TODO Auto-generated method stub
		dao.supprimerAliment(idAliment);
		
	}

	@Override
	public void modifierAliment(Aliment a) {
		// TODO Auto-generated method stub
		dao.modifierAliment(a);
		
	}

	@Override
	public LotAliments getLotAliments(Long idLot) {
		// TODO Auto-generated method stub
		return dao.getLotAliments(idLot);
	}

	@Override
	public void modifierPrixPlat(double prix, Plat p) {
		// TODO Auto-generated method stub
		dao.modifierPrixPlat(prix, p);
		
	}

	@Override
	public void ajouterUser(User u) {
		// TODO Auto-generated method stub
		dao.ajouterUser(u);
		
	}

	@Override
	public Long ajouterLotP(LotPlats lp) {
		// TODO Auto-generated method stub
		return dao.ajouterLotP(lp);
	}

	@Override
	public void supprimerLotP(Long idPlat) {
		// TODO Auto-generated method stub
	dao.supprimerLotP(idPlat);	
	}

	@Override
	public Long ajouterPlat(Plat p) {
		// TODO Auto-generated method stub
		return dao.ajouterPlat(p);
	}

	@Override
	public List<Plat> listPlats() {
		// TODO Auto-generated method stub
		return dao.listPlats();
	}

	@Override
	public Plat getPlat(Long idPlat) {
		// TODO Auto-generated method stub
		return dao.getPlat(idPlat);
	}

	@Override
	public void modifierPlat(Plat p) {
		// TODO Auto-generated method stub
		dao.modifierPlat(p);
	}

	@Override
	public void supprimerPlat(Long idPlat) {
		// TODO Auto-generated method stub
		dao.supprimerPlat(idPlat);
		
	}

	@Override
	public Long ajouterAliment(Aliment a) {
		// TODO Auto-generated method stub
		return dao.ajouterAliment(a);
	}

	@Override
	public Long ajouterFournisseur(Fournisseur Fo) {
		// TODO Auto-generated method stub
		return dao.ajouterFournisseur(Fo);
	}

	@Override
	public List<Fournisseur> listFournisseur() {
		// TODO Auto-generated method stub
		return dao.listFournisseur();
	}

	@Override
	public void supprimerFournisseur(Long idFour) {
		dao.supprimerFournisseur(idFour);
		
	}

	@Override
	public List<Aliment> listAliments() {
		// TODO Auto-generated method stub
		return dao.listAliments();
	}

	@Override
	public List<LotPlats> listLotPlats() {
		// TODO Auto-generated method stub
		return dao.listLotPlats();
	}

}
