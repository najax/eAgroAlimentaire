package com.miage.projet;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.miage.projet.entities.*;
import com.miage.projet.metier.IAdminMetier;



public class TestJPA {
	
	
	ClassPathXmlApplicationContext app;
	@Before
	public void setUp() throws Exception { 
		app=new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		
		
		
	}
	/* @Test
	public void test1() {
		try {
			
			IAdminMetier metier=(IAdminMetier) app.getBean("metier");
			List<Fournisseur> four=metier.listFournisseur();
			metier.ajouterFournisseur(new Fournisseur("bjnkl"));
			metier.ajouterFournisseur(new Fournisseur("bjnk"));
			metier.ajouterFournisseur(new Fournisseur("bjnZEAl"));
			List<Fournisseur> four2=metier.listFournisseur();
			
			assertTrue(true);
			
			
			} catch (Exception e) {
			assertTrue(e.getMessage(),false);
			}
	}

	@Test
	public void test2() {
		try {
			
			IAdminMetier metier=(IAdminMetier) app.getBean("metier");
			List<LotPlats> Ali=metier.listLotPlats();
			
			Plat p1=new Plat("sbagetti");
			Plat p2=new Plat("pate");
			metier.ajouterPlat(p1);
			metier.ajouterPlat(p2);
			
			
			metier.ajouterLotP(new LotPlats(2));
			metier.ajouterLotP(new LotPlats(3));
			List<LotPlats> Ali2=metier.listLotPlats();
			assertTrue((Ali2.size()==Ali.size()+2));
			
			
			} catch (Exception e) {
			assertTrue(e.getMessage(),false);
			}
	}
*/
	
	@Test
	public void test3() {
		try {
			
			IAdminMetier metier=(IAdminMetier) app.getBean("metier");
			List<LotPlats> Ali=metier.listLotPlats();
			metier.ajouterLot(new LotAliments(new Fournisseur("sami")));
			metier.ajouterLot(new LotAliments(new Fournisseur("sami")));
		/*metier.ajouterPlat(new Plat("spagetti"));
		metier.ajouterPlat(new Plat("patesx"));
*/
		List<LotPlats> Ali2=metier.listLotPlats();
			assertTrue((Ali2.size()==Ali.size()+2));
			
			
			} catch (Exception e) {
			assertTrue(e.getMessage(),false);
			}
	}
	@Test
	public void test4() {
		try {
			
			IAdminMetier metier=(IAdminMetier) app.getBean("metier");
			List<Aliment> Ali=metier.listAliments();
			metier.ajouterAliment(new Aliment("sel", "15/12/2016", 5));
			metier.ajouterAliment(new Aliment("carotte", "15/12/2008", 3,23,new LotAliments()));
			List<Aliment> Ali2=metier.listAliments();
			assertTrue((Ali2.size()==Ali.size()+2));
			
			
			} catch (Exception e) {
			assertTrue(e.getMessage(),false);
			}
	}

}
