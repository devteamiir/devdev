package com.devteam.locvoiture.service;

import java.util.List;

import com.devteam.locvoiture.model.Secretaire;

public interface SecretaireService {
	void ajouterSecretaire(Secretaire c);

	List<Secretaire> getSecretaires();

	Secretaire getUnSecretaireById(int id);

	void delete(Secretaire c);

	void modifier(Secretaire c);

}