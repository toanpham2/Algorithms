package ComparisonBasedSort;

import java.util.Random;

// Best case: O(n) if already sorted
// Worst case: unbounded if not
public class BogoSort {



    private static void BogoSort(int[] arr) {
        while(!isSorted(arr)) {
            Random rand = new Random();
            for (int i = arr.length - 1; i > 0; i--) {
                int index = rand.nextInt(i + 1);
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
            }
        }
    }

    private static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    // ComparisonBasedSort.BogoSort algorithm
    public static int[] BogoSortAlg(int[] arr) {

        BogoSort(arr);

        return arr;
    }

}

