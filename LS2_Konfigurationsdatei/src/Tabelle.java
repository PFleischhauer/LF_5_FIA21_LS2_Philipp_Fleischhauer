
public class Tabelle {

	public static void main(String[] args) {
		int a1 = -20;
		double a2 = -28.8889;
		int b1 = -10;
		double b2 = -23.3333;
		int c1 = -0;
		double c2 = -17.7778;
		int d1 = +20;
		double d2 = -6.6667;
		int e1 = +30;
		double e2 = -1.1111;
		System.out.printf("%-12s|", "Fahrenheit");
		System.out.printf("%10s\n", "Celsius");
		System.out.print("-----------------------\n");
		System.out.printf("%+-12d|%10.2f\n", a1, a2);

		System.out.printf("%+-12d|%10.2f\n", b1, b2);

		System.out.printf("%+-12d|%10.2f\n", c1, c2);

		System.out.printf("%+-12d|%10.2f\n", d1, d2);	

		System.out.printf("%+-12d|%10.2f\n", e1, e2);

	}

}
