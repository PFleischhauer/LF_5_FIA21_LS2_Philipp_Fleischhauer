public class SelectionSort {

	public static void main(String[] args) {
		int[] liste = { 4, 2, 10, 3, -5, 0, 17 };
		for (int e = 0; e < liste.length; e++) {
			System.out.print(liste[e] + ", ");
		}
		System.out.println();
		for (int i = 0; i < (int) (liste.length/2)+1; i++) {
			int lowest = i, tmp = 0;
			for (int j = i+1; j < liste.length; j++) {
				if (liste[lowest] > liste[j]) {
					lowest = j;
				}
			}
			tmp = liste[i];
			liste[i] = liste[lowest];
			liste[lowest] = tmp;

			for (int e = 0; e < liste.length; e++) {
				System.out.print(liste[e] + ", ");
			}
			System.out.println();
		}
	}

}