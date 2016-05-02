package com.miage.projet.entities;

import java.io.Serializable;


import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.NotEmpty;



@Entity
public class Plat implements Serializable{
	@Id
	@GeneratedValue

	private Long idPlat;
	@NotEmpty
	private String nom; 
	private double coutRevient;
	private double prix;
	
	private int tab_qte[];
	
	private ArrayList<Aliment> tab_alicompo;
	
	   
	   @ManyToOne
	   @JoinColumn(name="idLotPlat")
	   private LotPlats lotplats;
	   
   
   public Plat(String nom) {
		super();
		this.nom = nom;
	}
public Plat() {
		super();
		// TODO Auto-generated constructor stub
	}
public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Long getIdPlat() {
		return idPlat;
	}
	public void setIdPlat(Long idPlat) {
		this.idPlat = idPlat;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public ArrayList<Aliment> getTab_alicompo() {
		return tab_alicompo;
	}
	public void setTab_alicompo(ArrayList<Aliment> tab_alicompo) {
		this.tab_alicompo = tab_alicompo;
	}


   
   public double getCoutRevient() {
		return coutRevient;
	}
	public void setCoutRevient(double coutRevient) {
		this.coutRevient = coutRevient;
	}
	public int[] getTab_qte() {
		return tab_qte;
	}
	public void setTab_qte(int[] tab_qte) {
		this.tab_qte = tab_qte;
	}
	public LotPlats getLotplats() {
		return lotplats;
	}
	public void setLotplats(LotPlats lotplats) {
		this.lotplats = lotplats;
	}
	public double calculCR()
   {
	   double px = 0;
	   for(int i = 0;i < tab_alicompo.size()  ;i++)
	   {
		  px =+ tab_alicompo.get(i).getPrixAliment()*tab_qte[i];
	   }
	   return px;
   }
   
   public Plat(String nom, double prix) {
	super();
	this.nom = nom;
	this.prix = prix;
	coutRevient = calculCR();
}
   


}