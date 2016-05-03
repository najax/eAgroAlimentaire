package com.miage.projet.entities;

/***********************************************************************
 * Module:  LotPlats.java
 * Author:  ASUS
 * Purpose: Defines the Class LotPlats
 ***********************************************************************/

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class LotPlats {
	@Id
	@GeneratedValue
	
   private long idLotPlat;
   private int nbPlats;
   
   
   @OneToMany(mappedBy="lotplats")
   private Collection<Plat> tab_plats;
   
   
public LotPlats(Collection<Plat> tab_plats) {
	super();
	this.tab_plats = tab_plats;
}
public long getIdLotPlat() {
	return idLotPlat;
}
public void setIdLotPlat(int idLotPlat) {
	this.idLotPlat = idLotPlat;
}
public int getNbPlats() {
	return nbPlats;
}
public void setNbPlats(int nbPlats) {
	this.nbPlats = nbPlats;
}
public Collection<Plat> getTab_plats() {
	return tab_plats;
	
}
public void setTab_plats(ArrayList<Plat> tab_plats) {
	this.tab_plats = tab_plats;
}
public LotPlats() {
	super();
	// TODO Auto-generated constructor stub
}
public LotPlats(int nbPlats) {
	super();
	this.nbPlats = nbPlats;
}
   
   

   


}