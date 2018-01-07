package com.devteam.locvoiture.controller;

import java.util.Date;

import javax.sound.midi.Soundbank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.devteam.locvoiture.model.Utilisateur;
import com.devteam.locvoiture.service.UtilisateurServicelmpl;


@Controller
@RequestMapping("/")
public class UtilisateurController {
	
	
	
	
	//GESTION DES UTILISATEURS
	@Autowired
	private UtilisateurServicelmpl utilisateurService;


	@RequestMapping(value = "/ajoutUtilisateur", method = RequestMethod.GET)

	public String ajouter() {

		return "gestionUtilisateurs/ajoutUtilisateur";
	}

	// Enregistrement
	@RequestMapping(value = "/ajoutUtilisateur", method = RequestMethod.POST)

	public String ajouter(@ModelAttribute Utilisateur u, BindingResult result,
			@RequestParam("dateU") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date dateNaissance) {
			u.setDateNaissance(dateNaissance);
		if (result.hasErrors()) {
			System.out.println("erreur:::::: "+result.toString());
			return "gestionUtilisateurs/ajoutUtilisateur";
		}else {
			utilisateurService.ajouterUtilisateur(u);

			return "redirect:listeUtilisateurs";
		}
			
		

	}

	// liste utilisateurs

	@RequestMapping(value = "/listeUtilisateurs", method = RequestMethod.GET)

	public String index(Model m) {
		m.addAttribute("utilisateurs", utilisateurService.getUtilisateurs());
		return "gestionUtilisateurs/listeUtilisateurs";

	}
	
	
//	suppression
	
	@RequestMapping(value = "/suppressionUtilisateur", method = RequestMethod.GET)
	public String supprimer(@RequestParam String n) {
		
		Utilisateur u= utilisateurService.getUnUtlisateurById(Integer.parseInt(n));
		
		
		
		
		utilisateurService.delete(u);
		return "redirect:listeUtilisateurs";
		
	}
	
	
	
	//modification formulaire
	
	@RequestMapping(value = "/modificationUtilisateur", method = RequestMethod.GET)

	public String modifier(Model m, @RequestParam String n ) {
		int id= Integer.parseInt(n);
		System.out.println(id);
		Utilisateur u= utilisateurService.getUnUtlisateurById(id);
		System.out.println(u.toString());
		m.addAttribute("utilisateur", u);
		
		
		return "gestionUtilisateurs/modificationUtilisateur";
	}
	
	
//	traitement de modification
	
	@RequestMapping(value = "/modificationUtilisateur", method = RequestMethod.POST)

	public String modifier(@ModelAttribute Utilisateur u, BindingResult result,
			@RequestParam("dateU") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date dateNaissance) {
		u.setDateNaissance(dateNaissance);
		if (result.hasErrors()) {
			System.out.println("erreur:::::: "+result.toString());
			return "gestionUtilisateurs/ajoutUtilisateur";
		}else {
			utilisateurService.ajouterUtilisateur(u);

			return "redirect:listeUtilisateurs";
		}
			
		

	}
	
	
	
	

}
