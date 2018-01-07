package com.devteam.locvoiture.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devteam.locvoiture.model.Administrateur;
import com.devteam.locvoiture.repository.AdministrateurRepository;


@Service("administrateurService")
public class AdministrateurServicelmpl implements AdministrateurService {
	
	@Autowired
	private AdministrateurRepository administrateurRepository;

	@Override
	public void ajouterAdministrateur(Administrateur c) {
		
		administrateurRepository.save(c);
		
	}
	
	
	@Override
	public void modifier(Administrateur c) {
		
		administrateurRepository.save(c);
		
	}

	@Override
	public List<Administrateur> getAdministrateurs() {
		
		return administrateurRepository.findAll();
	}
	
	
	
	@Override
	public  void delete(Administrateur c) {
		
		administrateurRepository.delete(c);
		 
		 
	}


	@Override
	public Administrateur getUnAdministrateurById(int id) {
		return administrateurRepository.findOne(id);
	}


	
	
	
	

}

