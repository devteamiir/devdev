package com.devteam.locvoiture.model;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Client extends Utilisateur{
	
	public Client(int idUtilisateur, String nom, String prenom, String email, String adresse, String tel, String login,
			String password, Date dateNaissance) {
		super(idUtilisateur, nom, prenom, email, adresse, tel, login, password, dateNaissance);
		// TODO Auto-generated constructor stub
	}

	private String numPermis;
	

	public String getNumPermis() {
		return numPermis;
	}

	public void setNumPermis(String numPermis) {
		this.numPermis = numPermis;
	}
	
    
	
	

}
