
public class ArrayEinstieg1 {

	public static void main(String[] args) {
		int[] zahlen = new int[]{1, 6, 3, 7, 2};

		int i = 4;
		
	 	
		System.out.println(zahlen[1]); // 6
		System.out.println(zahlen[5]); // outofbounds
		System.out.println(zahlen[3]);  // 7
		System.out.println(zahlen[i]); // 2
		System.out.println(zahlen[i-2]); // 3
		System.out.println(zahlen[zahlen[4]]); // 3
		
		/*  3, 7,
		 *  1, 6, 3, 7, 2, 2, 4, 8, out of bounds
		 *  6, 7, 2, 8
		 * 
		 * */
	}

}
