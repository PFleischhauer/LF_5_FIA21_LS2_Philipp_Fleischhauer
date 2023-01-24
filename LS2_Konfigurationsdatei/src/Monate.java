import java.util.Scanner;

public class Monate {

	public static void main(String[] args) {
		Scanner tastatur = new Scanner(System.in);
		System.out.print("Monatszahl eingeben: ");
		int monatsZahl = tastatur.nextInt();
		
		switch(monatsZahl) {
		case 1:
			System.out.println("Januar");
			break;
		case 2:
			System.out.println("Februar");
			break;
		case 3:
			System.out.println("März");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("Mai");
			break;
		case 6:
			System.out.println("Juni");
			break;
		case 7:
			System.out.println("Juli");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("Oktober");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("Dezember");
			break;
		default:
			System.out.println("Kein Monat");
			break;
		}
	}

}
