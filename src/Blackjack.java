import java.util.Random;

public class Blackjack {
	public static void main(String[] args) {
		
	String [] kaartnummer = {"2", "3", "4", "5", "6", "7", "8", "9", "B", "V", "H", "A"}; 	
	String [] kleur = {"Klaveren", "Schoppen", "Ruiten", "Harten "};
	String [] kaartspelF = new String [52];
	
		
		for (int y=0; y < kleur.length; y++) {	
			for (int a = 0; a < kaartnummer.length; a++) {
				Random kleurcode = new Random();
				int z = kleurcode.nextInt(kleur.length);
				Random kaartje = new Random();
				int s = kaartje.nextInt(kaartnummer.length);
			
			//kaartspelF[counter] = kleur[z] + " " + kaartnummer[a];
			System.out.println(kleur[z] + " " + kaartnummer[s]);
			}

	}
	}
	
	
	
	//	for (int i=0 ; i < kleur.length; i++) {
	//	System.out.print(kleur[i]);
	//		for (int z=0 ; z < kaartnummer.length; z++) {
	//			System.out.println(kleur[i] + " " + kaartnummer[z]);
	//		}
	//	}
	
}

class Kaartspel {


	
}

class Bank {
	
}

class Speler { 

}
	
