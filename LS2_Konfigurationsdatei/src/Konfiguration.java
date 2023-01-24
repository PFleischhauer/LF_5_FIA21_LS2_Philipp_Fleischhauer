public class Konfiguration{
	public static void main(String[] args) {
		
		int euro;
		int cent;
		int summe;
		boolean status;
		double prozent;
		final String name;
		
		String typ = "Automat AVR";
		String bezeichnung = "Q2021_FAB_A";
		char sprachModul = 'd';
		double maximum = 100.00;
		double patrone = 46.24;
		byte PRUEFNR = 4;
		int muenzenCent = 1280;
		int muenzenEuro = 130;
		summe = muenzenCent + muenzenEuro * 100;
		
		prozent = maximum - patrone;
		name = typ + " " + bezeichnung;
		euro = summe / 100;
		cent = summe % 100;
		
		status = (euro <= 150) && (prozent >= 50.00) && (euro >= 50) && (cent != 0) 
				&& (sprachModul == 'd') &&  (!(PRUEFNR == 5 || PRUEFNR == 6));
		
		System.out.println("Name: " + name);
		System.out.println("Sprache: " + sprachModul);
		System.out.println("Prüfnummer : " + PRUEFNR);
		System.out.println("Füllstand Patrone: " + prozent + " %");
		System.out.println("Summe Euro: " + euro +  " Euro");
		System.out.println("Summe Rest: " + cent +  " Cent");       
		System.out.println("Status: " + status);
		
	}
}