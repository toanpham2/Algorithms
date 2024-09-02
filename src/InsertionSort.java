//Process each elements one by one, shift left until in correct order

//Best case: already sorted O(n)
//Worst case: sorted in reverse order O(n^2)
public class InsertionSort {
    private static void InsertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int x = arr[i];
            int j = i-1;
            while (j >= 0 && arr[j] > x) {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = x;
        }

    }

    // InsertionSort algorithm
    public static int[] InsertionSortAlg(int[] arr) {
        while (!Main.isSorted(arr)) {
            InsertionSort(arr);
        }
        return arr;
    }


}
