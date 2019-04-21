
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Blackjack20 {

	public static void main(String[] args) {
		int waardeinhand;
		ArrayList hand = new ArrayList<>();		
		deler handkaart = new deler();
		hand = handkaart.hand1();
		//int waarde11 = handkaart.cijferpunten1();
		//int waarde21 = handkaart.cijferpunten2();
		//int totalewaarde = waarde11 + waarde21;					
				
		//System.out.println(kaartspeler);
		//System.out.println(punten);
		System.out.println("U heeft nu de kaarten: " + hand + " in uw hand.");
		//System.out.println("Het totaal aantal punten in uw hand is nu: " + totalewaarde + ".");
		//System.out.println("Wilt u doorgaan? (J/N)");
		//String invoer = keuze.next();
		}
	}

//Hier wordt het kaartspel geschud.
class Deck {
	String[] kaartnummer = { "2", "3", "4", "5", "6", "7", "8", "9", "B", "10", "V", "H", "A" };
	String[] kleur = { "Klaveren ", "Schoppen ", "Ruiten ", "Harten " };
	public ArrayList<String> kaartspel() {
		ArrayList<String> kaartspel = new ArrayList<>();

		while (kaartspel.size() != 52) {
			Random kleurcode = new Random();
			int z = kleurcode.nextInt(kleur.length);
			Random kaartje = new Random();
			int s = kaartje.nextInt(kaartnummer.length);
			if (!kaartspel.contains((kleur[z] + kaartnummer[s]))) {
				kaartspel.add(kleur[z] + kaartnummer[s]);
			}			
		}System.out.println(kaartspel);
		return kaartspel;
		
	}
	
}

// Hier wordt er daadwerkelijk een kaart getrokken, nu voor de eerste keer.
class kaarttrekken {
	String kaart;
	String kaartinhand;	
	String waarde;
	
		public String kaartgepakt() {
		Deck b = new Deck();
		ArrayList<String> mijnKaartspel = b.kaartspel();
		for (int y = 0 ; y < 2; y++ ) {
		kaart = mijnKaartspel.get(0);
		}
			System.out.println(kaart);
		
		
		
		return kaart;

		}
}
// Hier worden de kaarten gedeeld. En de waarde van de kaarten bepaald. Voor nu alleen voor de eerste twee getrokken kaarten.
class deler {
	ArrayList spelerkaart = new ArrayList<>();
	String eerste;
	String tweede;
	String waarde1;
	String waarde2;
	int punten1;
	int punten2;
	public ArrayList hand1() {
		
		kaarttrekken handspeler = new kaarttrekken();
		eerste = handspeler.kaartgepakt();
		spelerkaart.add(eerste);
		tweede  = handspeler.kaartgepakt();
		spelerkaart.add(tweede);
		return spelerkaart;
		} 
	public String value1() {
		
		if (eerste.contains("Harten ")) { 
			waarde1 = eerste.replace("Harten " , "" );
		} 
		if (eerste.contains("Schoppen ")) {
			waarde1 = eerste.replace("Schoppen ",  "");
			}
		if (eerste.contains("Ruiten ")) {
				waarde1 = eerste.replace("Ruiten ",  "");
		} 	
		if (eerste.contains("Klaveren ")) {
				waarde1 = eerste.replace("Ruiten ",  "");
		
			
							
		} return waarde1;
	}
	public String value2() {
		
		if (tweede.contains("Harten ")) { 
			waarde2 = tweede.replace("Harten " , "" );
		} 
		if (tweede.contains("Schoppen ")) {
			waarde2 = tweede.replace("Schoppen ",  "");
			}
		if (tweede.contains("Ruiten ")) {
				waarde2 = tweede.replace("Ruiten ",  "");
		} 	
		if (tweede.contains("Klaveren ")) {
				waarde2 = tweede.replace("Ruiten ",  "");
		
										
		} return waarde2;
	}
	
	public int cijferpunten1() {
		switch (waarde1) {
		case "2": { 
			punten1 = 2;
		} break;
		case "3": {
			punten1 = 3;
		} break;
		case "4":{ 
			punten1 = 4;
		} break;
		case "5": { 
			punten1 = 5;
		} break;
		case "6": { 
			punten1 = 6;
		} break;
		case "7": { 
			punten1 = 7;
		} break;
		case "8": { 
			punten1 = 8;
		} break;
		case "9": { 
			punten1 = 9;
		} break;
		case "10": { 
			punten1 = 10;
		} break;
		case "B": { 
			punten1 = 11;
		} break;
		case "V": { 
			punten1 = 12;
		} break;
		case "H": { 
			punten1 = 13;
		} break;
		case "A": { 
			punten1 = 11;
		} break;
		default: { 
			punten1 = 0;
		} break;
		
		}System.out.println(punten1);
		return punten1;
	}
	
	public int cijferpunten2() {
		switch (waarde2) {
		case "2": { 
			punten2 = 2;
		} break;
		case "3": {
			punten2 = 3;
		} break;
		case "4":{ 
			punten2 = 4;
		} break;
		case "5": { 
			punten2 = 5;
		} break;
		case "6": { 
			punten2 = 6;
		} break;
		case "7": { 
			punten2 = 7;
		} break;
		case "8": { 
			punten2 = 8;
		} break;
		case "9": { 
			punten2 = 9;
		} break;
		case "10": { 
			punten2 = 10;
		} break;
		case "B": { 
			punten2 = 11;
		} break;
		case "V": { 
			punten2 = 12;
		} break;
		case "H": { 
			punten2 = 13;
		} break;
		case "A": { 
			punten2 = 11;
		} break;
		default: { 
			punten2 = 0;
		} break;
		
		}
		return punten2;
	}
		
}

