package com.devteam.locvoiture.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devteam.locvoiture.model.Secretaire;
import com.devteam.locvoiture.repository.SecretaireRepository;


@Service("secretaireService")
public class SecretaireServicelmpl implements SecretaireService {
	
	@Autowired
	private SecretaireRepository secretaireRepository;

	@Override
	public void ajouterSecretaire(Secretaire c) {
		
		secretaireRepository.save(c);
		
	}
	
	
	@Override
	public void modifier(Secretaire c) {
		
		secretaireRepository.save(c);
		
	}

	@Override
	public List<Secretaire> getSecretaires() {
		
		return secretaireRepository.findAll();
	}
	
	
	
	@Override
	public  void delete(Secretaire c) {
		
		secretaireRepository.delete(c);
		 
		 
	}


	@Override
	public Secretaire getUnSecretaireById(int id) {
		return secretaireRepository.findOne(id);
	}


	
	
	
	

}

