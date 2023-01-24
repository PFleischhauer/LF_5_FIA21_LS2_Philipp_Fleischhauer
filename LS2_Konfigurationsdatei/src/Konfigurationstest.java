
public class Konfigurationstest {

	public static void main(String[] args) {
		
		// Übung 1
		byte cent = 70;
		cent = 80;
		
		float maximum = 95.50F;
		
		// Übung 2
		boolean a = true;
		short smol = -1000;
		float big = (float) 1.255;
		char thing = '#';
		byte eight = 8;
		long notEight = 2147483648L;
		
		// Übung 3
		String word = "eins zwei drei";
		final int check_nr = 8765;
		
		
		// 1. Wegen Speicherplatz
		// 2. Art der Speicherung
		
		
		// Arbeitsblatt Operatoren
		int ergebnis = 4 + 8 * 9 - 1;
		System.out.println(ergebnis);
		int zaehler = 1;
		zaehler++;
		System.out.println(zaehler);
		ergebnis = 22 / 6;
		System.out.println(ergebnis);
		
		int schalter = 10;
		System.out.println(schalter != 10 || schalter == 12);
		
		String meine = "Meine Oma";
		String oma = " fährt im";
		String kanns = " Hühnerstall Motorrad";
		System.out.println(meine + oma + kanns);
		
		
	}

}
