package NonComparisonBasedSort;
//Process each integer input value, counting the number of times each values occur in input, Create the sorted output by
//frequencies

//Worst case: O(n+k), O(n) to find min/max, O(n) to count elements, O(n) to accumulate frequencies, O(n) to replace
//elements in sorted order
public class CountingSort {

    private static void CountingSort(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        //calculate the range of the elements
        int  k = max - min + 1;

        //create array to hold counts
        int[] counts = new int[k];

        //count frequency of values
        for (int i = 0; i < arr.length; i++) {
            counts[arr[i] - min]++;
        }

        //accumulate frequencies
        for (int i = 1; i < k; i++) {
            counts[i] += counts[i-1];
        }

        //Build final output array
        int[] fin = new int[arr.length];
        for (int i = arr.length - 1; i >=  0; i--) {
            fin[counts[arr[i]-min]-1] = arr[i];
            counts[arr[i]-min]--;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = fin[i];
        }
    }




    public static int[] CountingSortAlg(int[] arr) {

        CountingSort(arr);

        return arr;
    }

}


