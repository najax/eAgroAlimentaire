package com.miage.projet.controlleur;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class LoginController { 
	@RequestMapping("/login")
public String login(){
return "login";
}
@RequestMapping("/logout")
  public String logout(){
  return "login";
  }
}