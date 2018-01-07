 package com.devteam.locvoiture.model;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Administrateur extends Utilisateur{

	public Administrateur(int idUtilisateur, String nom, String prenom, String email, String adresse, String tel,
			String login, String password, Date dateNaissance) {
		super(idUtilisateur, nom, prenom, email, adresse, tel, login, password, dateNaissance);
		// TODO Auto-generated constructor stub
	}
	

}
   