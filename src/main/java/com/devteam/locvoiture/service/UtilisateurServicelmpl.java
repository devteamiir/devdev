package com.devteam.locvoiture.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devteam.locvoiture.model.Utilisateur;
import com.devteam.locvoiture.repository.UtilisateurRepository;


@Service("utilisateurService")
public class UtilisateurServicelmpl implements UtilisateurService {
	
	@Autowired
	private UtilisateurRepository utilisateurRepository;

	@Override
	public void ajouterUtilisateur(Utilisateur u) {
		
		utilisateurRepository.save(u);
		
	}
	
	
	@Override
	public void modifier(Utilisateur u) {
		
		utilisateurRepository.save(u);
		
	}

	@Override
	public List<Utilisateur> getUtilisateurs() {
		
		return utilisateurRepository.findAll();
	}
	
	
	
	@Override
	public  void delete(Utilisateur u) {
		
		utilisateurRepository.delete(u);
		 
		 
	}


	@Override
	public Utilisateur getUnUtlisateurById(int id) {
		return utilisateurRepository.findOne(id);
	}


	
	
	
	

}

