package com.devteam.locvoiture.service;

import java.util.List;

import com.devteam.locvoiture.model.Utilisateur;

public interface UtilisateurService {
	
		
		void ajouterUtilisateur(Utilisateur u);
		List<Utilisateur> getUtilisateurs();
		Utilisateur getUnUtlisateurById(int id);
		void delete(Utilisateur u);
		void modifier(Utilisateur u);

	

}
