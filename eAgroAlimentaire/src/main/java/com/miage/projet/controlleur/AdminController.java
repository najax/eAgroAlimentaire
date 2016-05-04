package com.miage.projet.controlleur;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.miage.projet.entities.Aliment;
import com.miage.projet.entities.Fournisseur;
import com.miage.projet.entities.LotAliments;
import com.miage.projet.metier.IAdminMetier;

@Controller
@RequestMapping(value="/admin")
public class AdminController {
	@Autowired
	private IAdminMetier metier;
	
	@RequestMapping(value="/index")
	public String index(Model model){ 
		
		model.addAttribute("Ali", new Aliment());
		model.addAttribute("Alis", metier.listAliments());
		
		model.addAttribute("lotAli", new LotAliments());
		model.addAttribute("fournisseur", new Fournisseur());
		
		model.addAttribute("lotsAlis", metier.listAliments());
		model.addAttribute("fournisseurs", metier.listFournisseur());
		
		
		return"admin";
		}

@RequestMapping("/saveAli")
	
	
	public String saveCat(@Valid Aliment a,BindingResult bindingResult,Model model) throws Exception{
		if(bindingResult.hasErrors()){
		
			model.addAttribute("Alis", metier.listAliments());
			return "aprovi";
		}
		else{
			
		if(a.getIdAliment()==null) {metier.ajouterAliment(a);}
		else {metier.modifierAliment(a);}
		model.addAttribute("Ali", new Aliment());
		model.addAttribute("Alis", metier.listAliments());
		return "admin";
		}
}		
		@RequestMapping(value="/suppAli")
		
		public String suppCat(Long idAliment,Model model){
		metier.supprimerAliment(idAliment); 
		model.addAttribute("Ali", new Aliment());
		model.addAttribute("Alis", metier.listAliments());
		return "admin";
		}
		
		@RequestMapping(value="/editAli")
		public String editCat(Long idAliment ,Model model){
		Aliment a=metier.getAliment(idAliment) ; 
		//model.addAttribute("editedAli", a);
		model.addAttribute("Ali",a );
		model.addAttribute("Alis", metier.listAliments());
		return "admin";}
		}

	

