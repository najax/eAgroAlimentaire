package com.miage.projet.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.NotEmpty;



@Entity
public class LotAliments implements Serializable{
	@Id
	@GeneratedValue

	private Long idLot;

	
	@ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name="idFour")
	private Fournisseur Fournisseur;   


	  @OneToMany(mappedBy="LotAliments")
	   private Set<Aliment> Aliments=new HashSet<Aliment>();

	public Long getIdLot() {
		return idLot;
	}
	public void setIdLot(Long idLot) {
		this.idLot = idLot;
	}
	public Fournisseur getFournisseur() {
		return Fournisseur;
	}
	public Set<Aliment> getLotAliments() {
		return Aliments;
	}
	public void setLotAliments(Set<Aliment> lotAliments) {
		this.Aliments = lotAliments;
	}
	public void setFournisseur(Fournisseur fournisseur) {
		this.Fournisseur = fournisseur;
	}

	public LotAliments() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LotAliments(Fournisseur fournisseur) {
		super();
		this.Fournisseur = fournisseur;
	}

}