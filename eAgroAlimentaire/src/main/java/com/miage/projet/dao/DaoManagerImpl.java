package com.miage.projet.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.miage.projet.entities.*;


public class DaoManagerImpl implements IDaoManager {
	
	
	@PersistenceContext
	private EntityManager em;
	
	 public void modifierPrixPlat(double prix,Plat p){
		 p.setPrix(prix);
		 em.merge(p);
	 }


	@Override
	public void supprimerLot(Long idLot) {
		LotAliments la=em.find(LotAliments.class,idLot);
		em.remove(la);		
	}


	@Override
	public Long ajouterLot(LotAliments la) {
		em.persist(la);
		return la.getIdLot();
	}

	@Override
	public List<Aliment> listAliments() {
		
		Query req=em.createQuery("select a from Aliment a");
		return req.getResultList();
	
	}

	@Override
	public Aliment getAliment(Long idAliment) {
		// TODO Auto-generated method stub
		
		return em.find(Aliment.class, idAliment);
	}

	@Override
	public void supprimerAliment(Long idAliment) {
		Aliment a=getAliment(idAliment);
		
		em.remove(a);	
	}

	@Override
	public void modifierAliment(Aliment a) {
		em.merge(a);
		
	}

	@Override
	public void ajouterUser(User u) {
		em.persist(u);	
	}


	@Override
	public Long ajouterFournisseur(Fournisseur Fo) {
		// TODO Auto-generated method stub
		em.persist(Fo);
		return (long) Fo.getIdFour();
	}


	@Override
	public void supprimerFournisseur(Long idFour) {
		// TODO Auto-generated method stub
		Fournisseur a=em.find(Fournisseur.class,idFour);
			
		em.remove(a);	
	
		
	}


	@Override
	public List<Fournisseur> listFournisseur() {
		// TODO Auto-generated method stub
		Query req=em.createQuery("select f from Fournisseur f");
		return req.getResultList();
		
		
		
	}


	@Override
	public Long ajouterLotP(LotPlats lp) {
		// TODO Auto-generated method stub
		em.persist(lp);
		return lp.getIdLotPlat();
	}


	@Override
	public void supprimerLotP(Long idPlat) {
		LotPlats lp=em.find(LotPlats.class,idPlat);
		
		em.remove(lp);
		
	}


	@Override
	public Long ajouterPlat(Plat p) {
		// TODO Auto-generated method stub
		em.persist(p);
		return p.getIdPlat();
	}


	@Override
	public List<Plat> listPlats() {
		// TODO Auto-generated method stub
		Query req=em.createQuery("select p from Plat a");
		return req.getResultList();
	
	}


	@Override
	public void modifierPlat(Plat p) {
		em.merge(p);		
	}


	@Override
	public void supprimerPlat(Long idPlat) {
		Plat p=getPlat(idPlat);
		
		em.remove(p);	
		
	}


	@Override
	public LotAliments getLotAliments(Long idLot) {
		return em.find(LotAliments.class, idLot);
	}


	@Override
	public Plat getPlat(Long idPlat) {
		return em.find(Plat.class, idPlat);
	}


	@Override
	public long ajouterAliment(Aliment a) {
		// TODO Auto-generated method stub
		em.persist(a);
		return a.getIdAliment() ;
		
	}


	@Override
	public List<LotPlats> listLotPlats() {
			// TODO Auto-generated method stub
			Query req=em.createQuery("select p from LotPlats p");
			return req.getResultList();
	}


	@Override
	public void calculerPrixPlat(float indice, Plat p) {
		// TODO Auto-generated method stub
		
		p.setPrix(p.getCoutRevient()*indice);
		em.merge(p);



	}

}