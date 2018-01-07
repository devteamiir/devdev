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

import com.devteam.locvoiture.model.Client;
import com.devteam.locvoiture.service.ClientServicelmpl;


@Controller
@RequestMapping("/")
public class ClientController {
	
	
	
	
	//GESTION DES PANNES
	@Autowired
	private ClientServicelmpl clientService;


	@RequestMapping(value = "/ajoutClient", method = RequestMethod.GET)

	public String ajouter() {

		return "gestionClients/ajoutClient";
	}

	// Enregistrement
	@RequestMapping(value = "/ajoutClient", method = RequestMethod.POST)

	public String ajouter(@ModelAttribute Client r, BindingResult result,
			@RequestParam("dateU") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date dateClient) {
			r.setDateNaissance(dateClient);
		if (result.hasErrors()) {
			System.out.println("erreur:::::: "+result.toString());
			return "gestionClients/ajoutClient";
		}else {
			clientService.ajouterClient(r);

			return "redirect:listeClients";
		}
			
		

	}

	// liste clients

	@RequestMapping(value = "/listeClients", method = RequestMethod.GET)

	public String index(Model m) {
		m.addAttribute("clients", clientService.getClients());
		return "gestionClients/listeClients";

	}
	
	
//	suppression
	
	@RequestMapping(value = "/suppressionClient", method = RequestMethod.GET)
	public String supprimer(@RequestParam String n) {
		
		Client r= clientService.getUnClientById(Integer.parseInt(n));
		
		
		
		
		clientService.delete(r);
		return "redirect:listeClients";
		
	}
	
	
	
	//modification formulaire
	
	@RequestMapping(value = "/modificationClient", method = RequestMethod.GET)

	public String modifier(Model m, @RequestParam String n ) {
		int id= Integer.parseInt(n);
		System.out.println(id);
		Client r= clientService.getUnClientById(id);
		System.out.println(r.toString());
		m.addAttribute("client", r);
		
		
		return "gestionClients/modificationClient";
	}
	
	
//	traitement de modification
	
	@RequestMapping(value = "/modificationClient", method = RequestMethod.POST)

	public String modifier(@ModelAttribute Client r, BindingResult result,
			@RequestParam("dateU") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date dateClient) {
		r.setDateNaissance(dateClient);
		if (result.hasErrors()) {
			System.out.println("erreur:::::: "+result.toString());
			return "gestionClients/ajoutClient";
		}else {
			clientService.ajouterClient(r);

			return "redirect:listeClients";
		}
			
		

	}
	
	
	
	

}
