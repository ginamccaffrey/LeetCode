public class BubbleSort2 {
    public static void bubbleSort(int[] array) {
    	/* Given an array, return the array sorted in ascending order 
    	 * O(n^2) efficiency 
    	 * Each pass moves the largest number to last index so the 
    	 * loop range shortens by 1 each pass */
		if (array.length > 1) {
			for (int i = 0; i < array.length - 1; i++) {
				for (int j = 0; j < array.length - i - 1; j++)
				if (array[j + 1] < array[j]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		for (int item : array) {
			System.out.print(item + " ");
		}
	}
    	
    public static void main(String[] args) {
    	int[] array = { 9, 8, 0, 4 };
    	bubbleSort(array);
    }
}