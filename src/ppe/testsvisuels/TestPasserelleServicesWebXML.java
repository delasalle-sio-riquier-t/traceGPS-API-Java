package ppe.testsvisuels;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

import ppe.classes.Outils;
import ppe.classes.PasserelleServicesWebXML;
import ppe.classes.PointDeTrace;
import ppe.classes.Trace;
import ppe.classes.Utilisateur;

public class TestPasserelleServicesWebXML {

	public static void main(String[] args) throws ParseException {
		
		String msg;
	
		// test visuel de la méthode getTousLesUtilisateurs


		// test visuel de la méthode getLesUtilisateursQueJautorise
		
		
//		// test visuel de la méthode getLesUtilisateursQueJautorise
//		ArrayList<Utilisateur> lesUtilisateurs = new ArrayList<Utilisateur>();
//		msg = PasserelleServicesWebXML.getLesUtilisateursQueJautorise("europa", Outils.sha1("mdputilisateur"), lesUtilisateurs);
//		// affichage de la réponse
//		System.out.println(msg);
//		// affichage du nombre d'utilisateurs
//		System.out.println("Nombre d'utilisateurs : " + lesUtilisateurs.size());
//		// affichage de tous les utilisateurs
//		for (Utilisateur unUtilisateur : lesUtilisateurs)
//		{	System.out.println(unUtilisateur.toString());
//		}

		// test visuel de la méthode getLesUtilisateursQuiMautorisent
		ArrayList<Utilisateur> lesUtilisateurs = new ArrayList<Utilisateur>();
		msg = PasserelleServicesWebXML.getLesUtilisateursQuiMautorisent("europa", Outils.sha1("mdputilisateur"), lesUtilisateurs);
		// affichage de la réponse
		System.out.println(msg);
		// affichage du nombre d'utilisateurs
		System.out.println("Nombre d'utilisateurs : " + lesUtilisateurs.size());
		// affichage de tous les utilisateurs
		for (Utilisateur unUtilisateur : lesUtilisateurs)
		{	System.out.println(unUtilisateur.toString());
		}

		
		// test visuel de la méthode getLesParcoursDunUtilisateur

		
		// test visuel de la méthode getUnParcoursEtSesPoints

	
	} // fin Main
} // fin class
