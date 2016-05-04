	package com.miage.projet.controlleur;
	
	import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.validation.Valid;
	
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.*;
	import org.springframework.ui.Model;
	import org.springframework.validation.BindingResult;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.SessionAttributes;
	
	import com.miage.projet.entities.Aliment;
	import com.miage.projet.entities.Fournisseur;
	import com.miage.projet.entities.LotAliments;
	import com.miage.projet.metier.IAproviMetier;
	
	
	@Controller  //annotation permettant de d�clarer le controleur au SPRING
	@RequestMapping(value="/aprovi") 
	@SessionAttributes({"editedAli","editedLot"}) // valeur de notre session de connexion
	
	
	
	public class AproviController {
		
		@Autowired
		private IAproviMetier metier;
	
	@RequestMapping(value="/index")
	public String index(Model model){ 
		
		model.addAttribute("Ali", new Aliment());
		model.addAttribute("Alis", metier.listAliments());
		
		model.addAttribute("lotAli", new LotAliments());
		model.addAttribute("fournisseur", new Fournisseur());
		
		model.addAttribute("lotsAlis", metier.listAliments());
		model.addAttribute("fournisseurs", metier.listFournisseur());
		
		
		return"aprovi";
		}
	@RequestMapping(value="/generate")
	public String generate(@Valid LotAliments l,BindingResult bindingResult,Model model){ 
		if(bindingResult.hasErrors()){
			
			model.addAttribute("Ali", new Aliment());
			model.addAttribute("Alis", metier.listAliments());
			
			model.addAttribute("lotAli", new LotAliments());
			model.addAttribute("lotsAlis", metier.listAliments());
			
			model.addAttribute("fournisseur", new Fournisseur());
			model.addAttribute("fournisseurs", metier.listFournisseur());
			
						return "aprovi";
		}
		else{
			
			if(l.getIdLot()==null) {metier.ajouterLot(l);
			long q=l.getIdLot();
			Set<Aliment> lots =  new HashSet<Aliment>();
			
			for(int i = 1; i <= l.getQteLot(); i++)
			{
			
			
			lots.add(new Aliment( "Aliment numero"+Integer.toString(i)));
			
			model.addAttribute("Ali"+Integer.toString(i), new Aliment());
			System.out.println("Ali"+Integer.toString(i));
			
			
			}
			l.setLotAliments(lots);
				model.addAttribute("lotAli", l);
					
			
			}
			
		model.addAttribute("Ali", new Aliment());
		model.addAttribute("Alis", metier.listAliments());
		
		model.addAttribute("lotsAlis", metier.listAliments());
		
		model.addAttribute("fournisseur", new Fournisseur());
		model.addAttribute("fournisseurs", metier.listFournisseur());
		
		
		return"aprovi";
		
		}
		
	}
	
	
	
	
	
	@RequestMapping("/saveAli")
	
	
	public String saveCat(@Valid Aliment a,BindingResult bindingResult,Model model) throws Exception{
		if(bindingResult.hasErrors()){
		
			model.addAttribute("Alis", metier.listAliments());
			return "aprovi";
		}
		else{
			
			if(a.getIdAliment()!=null){
				  Aliment cat=(Aliment) model.asMap().get("editedAli");
			}
		if(a.getIdAliment()==null) {metier.ajouterAliment(a);}
		else {metier.modifierAliment(a);}
		model.addAttribute("Ali", new Aliment());
		model.addAttribute("Alis", metier.listAliments());
		return "aprovi";
		}
		}


	@RequestMapping(value="/saveFour")
	public String saveCat(@Valid Fournisseur  a,BindingResult bindingResult,Model model){
		if(bindingResult.hasErrors()){
			
			model.addAttribute("fournisseurs", metier.listFournisseur());
			return "aprovi";
		}
		else {metier.ajouterFournisseur(a) ;}
			
			model.addAttribute("Ali", new Aliment());
			model.addAttribute("Alis", metier.listAliments());
			return "aprovi";
			}
		
	
	@RequestMapping(value="/suppFour")
	public String suppCat(Long idFour,Model model){
	metier.supprimerFournisseur(idFour); 
	model.addAttribute("Fournisseur", new Fournisseur());
	model.addAttribute("Fournisseurs", metier.listFournisseur()  );
	return "aprovi";
	}
	
	@RequestMapping(value="/editAli")
	public String editCat(Long idAliment ,Model model){
	Aliment a=metier.getAliment(idAliment) ; 
	model.addAttribute("editedAli", a);
	model.addAttribute("Ali",a );
	model.addAttribute("Alis", metier.listAliments());
	return "aprovi";}
	
	}