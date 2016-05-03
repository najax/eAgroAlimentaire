package com.miage.projet.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;



@Entity
public class Fournisseur {
	
	@Id
	@GeneratedValue
	
	 private long idFour;
	@NotEmpty
	private String nomFour;  
  
public String getNomFour() {
	return nomFour;
}
public void setNomFour(String nom) {
	this.nomFour = nom;
}
public long getIdFour() {
	return idFour;
}
public void setIdFour(long id) {
	this.idFour = id;
}


public Fournisseur() {
	super();
	// TODO Auto-generated constructor stub
}
public Fournisseur(String nom) {
	super();
	this.nomFour = nom;
}  
  
}