package com.miage.projet.entities;

import java.io.Serializable;

import javax.persistence.*;
import org.hibernate.validator.constraints.*;

@Entity
@Table 
public class Aliment  implements Serializable{
	@Id
	@GeneratedValue
	
	private Long idAliment;
	
	private String nomAliment;
	private String datePeremption;
	
	private int qteAliment;
	private double prixAliment;

	@ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name="idLot")
	private LotAliments LotAliments;


	@ManyToOne
	@JoinColumn(name="idPlat")
	private Plat plat;

	public Long getIdAliment() {
		return idAliment;
	}
	public void setIdAliment(Long idAliment) {
		this.idAliment = idAliment;
	}

	public LotAliments getLotAliments() {
		return LotAliments;
	}
	public void setLotAliments(LotAliments lotAliments) {
		this.LotAliments = lotAliments;
	}
	
	public Aliment(Long idAliment, String nomAliment, String datePeremption, int qteAliment, double prixAliment) {
		super();
		this.idAliment = idAliment;
		this.nomAliment = nomAliment;
		this.datePeremption = datePeremption;
		this.qteAliment = qteAliment;
		this.prixAliment = prixAliment;
	
	}
	public Aliment(Long idAliment, String nomAliment, String datePeremption, int qteAliment, double prixAliment,
			com.miage.projet.entities.LotAliments lotAliments) {
		super();
		this.idAliment = idAliment;
		this.nomAliment = nomAliment;
		this.datePeremption = datePeremption;
		this.qteAliment = qteAliment;
		this.prixAliment = prixAliment;
		LotAliments = lotAliments;
	}
	
	public String getNomAliment() {
		return nomAliment;
	}
	public void setNomAliment(String nomAliment) {
		this.nomAliment = nomAliment;
	}

	public String getDatePeremption() {
		return datePeremption;
	}
	public void setDatePeremption(String datePeremption) {
		this.datePeremption = datePeremption;
	}
	public int getQteAliment() {
		return qteAliment;
	}
	public void setQteAliment(int qte) {
		this.qteAliment = qte;
	}
	public double getPrixAliment() {
		return prixAliment;
	}
	public void setPrixAliment(double prix) {
		this.prixAliment = prix;
	}
	public Aliment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Aliment(String nom, String datePeremption, int qte) {
		super();
		this.nomAliment = nom;
		this.datePeremption = datePeremption;
		this.qteAliment = qte;
		
	
	}
	public Aliment(String nomAliment, String datePeremption, int qteAliment, double prixAliment,
			com.miage.projet.entities.LotAliments lotAliments) {
		super();
		this.nomAliment = nomAliment;
		this.datePeremption = datePeremption;
		this.qteAliment = qteAliment;
		this.prixAliment = prixAliment;
		LotAliments = lotAliments;
	}
	

}