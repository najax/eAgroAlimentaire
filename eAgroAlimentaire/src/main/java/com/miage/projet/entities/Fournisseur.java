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
  
public String getNom() {
	return nomFour;
}
public void setNom(String nom) {
	this.nomFour = nom;
}
public long getId() {
	return idFour;
}
public void setId(int id) {
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