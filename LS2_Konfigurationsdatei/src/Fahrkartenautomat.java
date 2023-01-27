import java.util.Scanner;

class Fahrkartenautomat {
	public static void main(String[] args) {

		Scanner tastatur = new Scanner(System.in);

		begruessung();
		double zuZahlenderBetrag = fahrkartenbestellungErfassen(tastatur);
		double eingezahlterGesamtbetrag = fahrkartenBezahlen(tastatur, zuZahlenderBetrag);
		fahrkartenAusgeben();
		rueckgeldAusgeben(zuZahlenderBetrag, eingezahlterGesamtbetrag);
		
		tastatur.close();
	}
	
	public static void begruessung() {
		System.out.println("Willkommen!\n");
		
	}
	
	public static double fahrkartenbestellungErfassen(Scanner tastatur) {
		String[] fahrkartenBezeichnung = new String[] {"Einzelfahrschein AB", "Einzelfahrschein BC", "Einzelfahrschein ABC", "Kurzstrecke AB", "Tageskarte AB", "Tageskarte BC", "Tageskarte ABC", "4-Fahrten-Karte AB", "4-Fahrten-Karte BC", "4-Fahrten-Karte ABC", "Kleingruppen-Tageskarte AB", "Kleingruppen-Tageskarte BC", "Kleingruppen-Tageskarte ABC"};
		double[] fahrkartenPreis = new double[] {3.00D, 3.50D, 3.80D, 2.00D, 8.60D, 9.20D, 10.00D, 9.40D, 12.60D, 13.80D, 25.50D, 26.00D, 26.50D};
		double zahlungsPuffer = 0;
		double zwischenPreis = 0;
		double zuZahlenderBetrag = 0;
		int anzahlTickets = 0;
		
		System.out.print("Wählen Sie ihre Wunschkarte aus:\n");
		for(int i = 0; i < fahrkartenPreis.length; i++) {
			System.out.printf("(%3s%2s%30s%2s%4s%3s", i, ")", fahrkartenBezeichnung[i], "[", fahrkartenPreis[i], "EUR]\n");
		}
		System.out.printf("(%3s%2s%30s", "100", ")", "Bestellung abschließen.");
		while(zuZahlenderBetrag == 0) {
			int i = tastatur.nextInt();
			
			
			if(i == 100) {
				zuZahlenderBetrag = zwischenPreis;
				break;
			} else {
				zahlungsPuffer = fahrkartenPreis[i];
			}
			
			if(zuZahlenderBetrag == 0 && zahlungsPuffer == 0) {
				System.out.print("Bitte Ticket wählen." + zuZahlenderBetrag);
			} else if (i != 100) {
				System.out.print("Anzahl der Tickets: ");
				anzahlTickets = tastatur.nextInt();
				
				while(anzahlTickets > 10 || anzahlTickets <= 0) {
					System.out.print("Zahl zwischen 0 und 10 eingeben: ");
					anzahlTickets = tastatur.nextInt();
				}
				zwischenPreis += zahlungsPuffer * anzahlTickets;
				System.out.print("Wählen Sie ihre Wunschkarte aus:\n");
				for(int j = 0; j < fahrkartenPreis.length; j++) {
					System.out.println("(" + j + ") " + fahrkartenBezeichnung[j] + " [" + fahrkartenPreis[j] + " EUR]");
				}
				System.out.print("Zwischenpreis: " + zwischenPreis + " Euro.\n");
				zahlungsPuffer = 0;
				
			}
			
			
		}
		return zwischenPreis;
	}
	
	// Geldeinwurf
	public static double fahrkartenBezahlen(Scanner tastatur, double zuZahlenderBetrag) {
		double nochZuZahlen;
		double eingezahlterGesamtbetrag;
		double eingeworfeneMuenze;
		
		eingezahlterGesamtbetrag = 0.0;
		nochZuZahlen = 0.0;
		while (eingezahlterGesamtbetrag < zuZahlenderBetrag /* * anzahlTickets*/) {
			nochZuZahlen = zuZahlenderBetrag /* * anzahlTickets */ - eingezahlterGesamtbetrag;
			System.out.printf("Noch zu zahlen: %.2f %s", nochZuZahlen, "Euro\n");
			System.out.print("Eingabe (mind. 5 Cent, höchstens 20 Euro): ");
			eingeworfeneMuenze = tastatur.nextDouble();
			if (eingeworfeneMuenze == 20 || eingeworfeneMuenze == 10 || eingeworfeneMuenze == 5 
			|| eingeworfeneMuenze == 2 || eingeworfeneMuenze == 1 || eingeworfeneMuenze == 0.50 
			|| eingeworfeneMuenze == 0.20 || eingeworfeneMuenze == 0.10 || eingeworfeneMuenze == 0.05) {
				eingezahlterGesamtbetrag = eingezahlterGesamtbetrag + eingeworfeneMuenze;
			} else {
				System.out.println("Akzeptierte Münzen und Scheine: 20€, 10€, 5€, 2€, 1€, 0,50€, 0,20€, 0,10€, 0,05€.");
				eingeworfeneMuenze = 0;
				eingezahlterGesamtbetrag = eingezahlterGesamtbetrag + eingeworfeneMuenze;
			}
		}
		return eingezahlterGesamtbetrag;
	}
	
	public static void fahrkartenAusgeben() {
		// Fahrscheinausgabe
				System.out.println("\nFahrschein wird ausgegeben");
				for (int i = 0; i < 8; i++) {
					System.out.print("=");
					try {
						Thread.sleep(200);
					} 
					catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("\n\n");
	}
	
	public static void rueckgeldAusgeben(double zuZahlenderBetrag, double eingezahlterGesamtbetrag) {
		// Rückgeldberechnung und -ausgabe
		double rueckgabebetrag;
		
				rueckgabebetrag = eingezahlterGesamtbetrag - zuZahlenderBetrag /* * anzahlTickets*/ ;
				if (rueckgabebetrag > 0.0) {
					System.out.printf("Der Rückgabebetrag in Höhe von %.2f%s", rueckgabebetrag, " Euro ");
					System.out.println("wird in folgenden Münzen ausgezahlt:");

					while (rueckgabebetrag >= 2.0) { // 2-Euro-Münzen
						System.out.println("2 Euro");
						rueckgabebetrag = rueckgabebetrag - 2.0;
					}
					while (rueckgabebetrag >= 1.0) { // 1-Euro-Münzen
						System.out.println("1 Euro");
						rueckgabebetrag = rueckgabebetrag - 1.0;
					}
					while (rueckgabebetrag >= 0.5) { // 50-Cent-Münzen
						System.out.println("50 Cent");
						rueckgabebetrag = rueckgabebetrag - 0.5;
					}
					while (rueckgabebetrag >= 0.2) { // 20-Cent-Münzen
						System.out.println("20 Cent");
						rueckgabebetrag = rueckgabebetrag - 0.2;
					}
					while (rueckgabebetrag >= 0.1) { // 10-Cent-Münzen
						System.out.println("10 Cent");
						rueckgabebetrag = rueckgabebetrag - 0.1;
					}
					while (rueckgabebetrag >= 0.05) { // 5-Cent-Münzen
						System.out.println("5 Cent");
						rueckgabebetrag = rueckgabebetrag - 0.05;
					}
					while (rueckgabebetrag >= 0.02) { // 2-Cent-Münzen
						System.out.println("2 Cent");
						rueckgabebetrag = rueckgabebetrag - 0.02;
					}
					while (rueckgabebetrag >= 0.01) { // 1-Cent-Münzen
						System.out.println("1 Cent");
						rueckgabebetrag = rueckgabebetrag - 0.01;
					}
					if (rueckgabebetrag < 0.01) {
						rueckgabebetrag = 0;
					}
				}

				System.out.println("\nVergessen Sie nicht, den Fahrschein\n" + "vor Fahrtantritt entwerten zu lassen!\n"
						+ "Wir wünschen Ihnen eine gute Fahrt.");

	}
}