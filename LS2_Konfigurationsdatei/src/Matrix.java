import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		Scanner tastatur = new Scanner(System.in);
		int eingabe = tastatur.nextInt();

		for(int i = -1; i < 99; i += 10) {
			for(int j = 1; j <= 10; j++) {
				
				
				int s = i + j;
				
				if (s % eingabe == 0 || Integer.toString(s).contains(Integer.toString(eingabe)) || eingabe == myMethod(s)) {	
					System.out.printf("%4s", "*");
				} else {
					System.out.printf("%4s", s);
				}
			}
			System.out.println();
		}
		
		tastatur.close();
	}
	private static int myMethod (int n) {
	    int sum = 0;
	    while (0 != n) {
	        sum += n%10;
	        n /= 10;
	    }
	    return sum;

	}
}
