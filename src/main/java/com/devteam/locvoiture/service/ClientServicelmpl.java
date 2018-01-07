package com.devteam.locvoiture.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devteam.locvoiture.model.Client;
import com.devteam.locvoiture.repository.ClientRepository;


@Service("clientService")
public class ClientServicelmpl implements ClientService {
	
	@Autowired
	private ClientRepository clientRepository;

	@Override
	public void ajouterClient(Client c) {
		
		clientRepository.save(c);
		
	}
	
	
	@Override
	public void modifier(Client c) {
		
		clientRepository.save(c);
		
	}

	@Override
	public List<Client> getClients() {
		
		return clientRepository.findAll();
	}
	
	
	
	@Override
	public  void delete(Client c) {
		
		clientRepository.delete(c);
		 
		 
	}


	@Override
	public Client getUnClientById(int id) {
		return clientRepository.findOne(id);
	}


	
	
	
	

}

