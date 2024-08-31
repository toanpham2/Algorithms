import java.util.*;

// Best case: O(n) if already sorted
// Worst case: unbounded if not
public class BogoSort {



    private static void BogoSort(int[] arr) {
        Random rand = new Random();
        for (int i = arr.length - 1; i > 0; i--) {
            int index = rand.nextInt(i + 1);
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }

    }

    // BogoSort algorithm
    public static int[] BogoSortAlg(int[] arr) {
        while (!Main.isSorted(arr)) {
            BogoSort(arr);
        }
        return arr;
    }

}

