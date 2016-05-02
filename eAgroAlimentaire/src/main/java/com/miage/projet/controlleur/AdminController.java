package com.miage.projet.controlleur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.miage.projet.metier.IAdminMetier;

@Controller
@RequestMapping(value="/admin")
public class AdminController {
	@Autowired
	private IAdminMetier metier;
	
}
