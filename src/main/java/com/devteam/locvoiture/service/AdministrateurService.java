package com.devteam.locvoiture.service;

import java.util.List;

import com.devteam.locvoiture.model.Administrateur;
public interface AdministrateurService {
		void ajouterAdministrateur(Administrateur c);
		List<Administrateur> getAdministrateurs();
		Administrateur getUnAdministrateurById(int id);
		void delete(Administrateur c);
		void modifier(Administrateur c);

	

}