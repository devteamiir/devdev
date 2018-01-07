package com.devteam.locvoiture.service;

import java.util.List;

import com.devteam.locvoiture.model.Client;
public interface ClientService {
		void ajouterClient(Client c);
		List<Client> getClients();
		Client getUnClientById(int id);
		void delete(Client c);
		void modifier(Client c);

	

}