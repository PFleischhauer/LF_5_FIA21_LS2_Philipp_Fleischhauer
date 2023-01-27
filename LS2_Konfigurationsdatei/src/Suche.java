
public class Suche {

	public static void main(String[] args) {
		int[] zahlenArray = { 1, 5, 5, 7, 3, 11, 22, 23, 27 }; 		
		int[] zahlenArray2 = { 33, 5, 3, 5, 9, 7, 11, 23, 23, 3};
		int gesuchterWert = 2;
		int gesuchterWert2 = 3;
		int a = 0;
		int b = 0;
		
		for(int i = 0; i < zahlenArray.length; i++) {
			if(zahlenArray[i] == gesuchterWert) {
				System.out.println("Gefunden!");
				break;
			} else {
				a++;
			}
			if(a == zahlenArray.length) {
				System.out.println("Nicht Gefunden!");
			}
		}
		for(int i = 0; i < zahlenArray.length; i++) {
			if(zahlenArray[i] == gesuchterWert2) {
				System.out.println("Gefunden!");
				break;
			} else {
				b++;
			}
			if(b == zahlenArray.length) {
				System.out.println("Nicht Gefunden!");
			}
		}
	}

}
