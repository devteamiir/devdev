package com.devteam.locvoiture.model;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Secretaire  extends Utilisateur{

	public Secretaire(int idUtilisateur, String nom, String prenom, String email, String adresse, String tel,
			String login, String password, Date dateNaissance) {
		super(idUtilisateur, nom, prenom, email, adresse, tel, login, password, dateNaissance);
		// TODO Auto-generated constructor stub
	}
	
	public Secretaire( String nom, String prenom, String email, String adresse, String tel,
			String login, String password, Date dateNaissance) {
		super( nom, prenom, email, adresse, tel, login, password, dateNaissance);
		// TODO Auto-generated constructor stub
	}

	public Secretaire() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
    