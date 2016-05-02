package com.miage.projet.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_id")
	private Long idUser;
	@Column(name="user_name")

	private String userName;
	private String password;
	private boolean actived;
	private String role;
	public User(String userName, String password, boolean actived,String role) {
		super();
		this.userName = userName;
		this.password = password;
		this.actived = actived;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getIdUser() {
		return idUser;
	}
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isActived() {
		return actived;
	}
	public void setActived(boolean actived) {
		this.actived = actived;
	}
	public String getRoles() {
		return role;
	}
	public void setRoles(String role) {
		this.role = role;
	}
}
