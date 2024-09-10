package ComparisonBasedSort;
//Find minimum unsorted element and swap it with the first unsorted element

//Best case: O(n^2)
//Worst case: O(n^2)
public class SelectionSort {
    private static void SelectionSort(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }

    }

    // ComparisonBasedSort.SelectionSort algorithm
    public static int[] SelectionSortAlg(int[] arr) {

        SelectionSort(arr);

        return arr;
    }


}
