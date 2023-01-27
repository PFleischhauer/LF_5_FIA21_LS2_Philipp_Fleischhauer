public class Zahlen {

	public static void main(String[] args) {
		int[] zahlen = {3,4,2,3,5,1,2,7,2,1,2,4};
		int highestIndex = 0;
		int highestCount = 0;

		for(int i = 0; i < zahlen.length; i++) {
			int indexCount = count(i, zahlen.length, zahlen);
			if(indexCount > highestCount) {
				highestCount = indexCount;
				highestIndex = i;
			}
		}
		System.out.println("Häufigste Zahl: " + zahlen[highestIndex] + "(" + highestCount + ")");
	}
	
	public static int count(int index, int arrayLength, int[] array) {
		int counter = 0;
		for(int j = 0; j < arrayLength; j++) {
			if(array[j] == array[index]) {
				counter++;
			}
		}
		return counter;
	}
}