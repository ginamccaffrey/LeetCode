public class BubbleSort {
    public static void bubbleSort(int[] array) {
        boolean swapped;
        int n = array.length;
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (array[i] > array[i + 1]) {
                    // Swap elements
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }
}
