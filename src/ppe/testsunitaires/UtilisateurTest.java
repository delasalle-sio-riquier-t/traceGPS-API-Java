package ppe.testsunitaires;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import ppe.classes.Outils;
import ppe.classes.Utilisateur;

public class UtilisateurTest {
	
	private Utilisateur utilisateur1;
	private Utilisateur utilisateur2;
	
	@Before
	public void setUp() throws Exception {
		utilisateur1 = new Utilisateur();
		
		int unId = 111;
		String unPseudo = "toto";
		String unMdpSha1 = "abcdef";
		String uneAdrMail = "toto@free.fr";
		String unNumTel = "1122334455";
		int unNiveau = 1;
		Date uneDateCreation = Outils.convertirEnDateHeure("21/06/2016 14:00:00");
		int unNbTraces = 3;
		Date uneDateDerniereTrace = Outils.convertirEnDateHeure("28/06/2016 14:00:00");
		utilisateur2 = new Utilisateur(unId, unPseudo, unMdpSha1, uneAdrMail, unNumTel, unNiveau, uneDateCreation, unNbTraces, uneDateDerniereTrace);
	}

	@Test
	public void testGetId() {
		assertEquals("Test getId", "", utilisateur1.getId());
		assertEquals("Test getId", "111", utilisateur2.getId());	
	}

	@Test
	public void testSetId() {
		utilisateur1.setId(112);
		assertEquals("Test setId", "112", utilisateur1.getId());
	}

	@Test
	public void testGetPseudo() {
		assertEquals("Test getPseudo", "", utilisateur1.getPseudo());
		assertEquals("Test getPseudo", "toto", utilisateur2.getPseudo());
	}

	@Test
	public void testSetPseudo() {
		utilisateur1.setPseudo("Bob");
		assertEquals("Test setPseudo", "Bob", utilisateur1.getPseudo());
	}

	@Test
	public void testGetMdpSha1() {
		assertEquals("Test GetMdpSha1", "", utilisateur1.getMdpSha1());
		assertEquals("Test GetMdpSha1", "abcdef", utilisateur2.getMdpSha1());
	}

	@Test
	public void testSetMdpSha1() {
		utilisateur1.setMdpSha1("azerty");
		assertEquals("Test setMdpSha1", "azerty", utilisateur1.getMdpSha1());
	}

	@Test
	public void testGetAdrMail() {
		assertEquals("Test getAdrMail", "", utilisateur1.getAdrMail());
		assertEquals("Test getAdrMail", "toto@free.fr", utilisateur2.getAdrMail());
	}

	@Test
	public void testSetAdrMail() {
		utilisateur1.setAdrMail("vincentlf56@gmail.com");
		assertEquals("Test SetAdrMail", "vincentlf56@gmail.com", utilisateur1.getAdrMail());
	}

	@Test
	public void testGetNumTel() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetNumTel() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetNiveau() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetNiveau() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetDateCreation() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetDateCreation() throws ParseException {
		fail("Not yet implemented");
	}

	@Test
	public void testGetNbTraces() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetNbTraces() {
		utilisateur1.setNbTraces(5);
		assertEquals("Test setNbTraces", "5", utilisateur1.getNbTraces());
	}

	@Test
	public void testGetDateDerniereTrace() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetDateDerniereTrace() throws ParseException {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		String msg = "";
	    msg += "id : " + "0" + "\n";
	    msg += "pseudo : " + "" + "\n";
	    msg += "mdpSha1 : " + "" + "\n";
	    msg += "adrMail : " + "" + "\n";
	    msg += "numTel : " + "" + "\n";
	    msg += "niveau : " + "0" + "\n";
	    msg += "nbTraces : " + "0" + "\n";
	    assertEquals("Test toString", msg, utilisateur1.toString());
	    
		msg = "";
	    msg += "id : " + "111" + "\n";
	    msg += "pseudo : " + "toto" + "\n";
	    msg += "mdpSha1 : " + "abcdef" + "\n";
	    msg += "adrMail : " + "toto@free.fr" + "\n";
	    msg += "numTel : " + "11.22.33.44.55" + "\n";
	    msg += "niveau : " + "1" + "\n";
	    msg += "dateCreation : " + "21/06/2016 14:00:00" + "\n";
	    msg += "nbTraces : " + "3" + "\n";
	    msg += "dateDerniereTrace : " + "28/06/2016 14:00:00" + "\n";
	    assertEquals("Test toString", msg, utilisateur2.toString());
	}

}
