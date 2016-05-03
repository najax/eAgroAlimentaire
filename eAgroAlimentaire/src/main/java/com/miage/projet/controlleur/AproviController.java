	package com.miage.projet.controlleur;
	
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

	@RequestMapping(value="/suppAli")
	public String suppCat(Long idAliment,Model model){
	metier.supprimerAliment(idAliment); 
	model.addAttribute("Ali", new Aliment());
	model.addAttribute("Alis", metier.listAliments());
	return "aprovi";
	}
	
	@RequestMapping(value="/editAli")
	public String editCat(Long idAliment ,Model model){
	Aliment a=metier.getAliment(idAliment) ; 
	//model.addAttribute("editedAli", a);
	model.addAttribute("Ali",a );
	model.addAttribute("Alis", metier.listAliments());
	return "aprovi";}
	
	}