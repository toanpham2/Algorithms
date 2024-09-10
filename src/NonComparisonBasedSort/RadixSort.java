package NonComparisonBasedSort;
//N = radix (number of unique digits used to represent numbers in a numerical system; base 10 radix = 10)
//Auxiliary array B of N buckets
//W is word size of integers (max number of digits in input integer)
//Starting with least significant digit of each elements in S, add each elements to buckets
//Move elements out of B[i] back to S
//Repeat with next most significant digit
//Repeat with next most significant digit
//Use Counting sort to help


public class RadixSort {


    private static void RadixSort(int[] arr) {

        int max  = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
    }

    public static int[] RadixSortAlg(int[] arr) {

        RadixSort(arr);

        return arr;
    }

}
