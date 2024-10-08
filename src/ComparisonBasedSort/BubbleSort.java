package ComparisonBasedSort;

//Compare pairs of adjacent elements, swap adjacent elements if they are not in order, repeat until no swaps are needed

//Best case: already sorted O(n)
//Worst case: sorted in reverse order O(n^2)
public class BubbleSort {
    private static void BubbleSort(int[] arr) {
        boolean repeat = true;
        while(repeat){
            repeat = false;
            for(int i = 1; i < arr.length; i++){
                if(arr[i] < arr[i-1]){
                    int x = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = x;
                    repeat = true;
                }
            }
        }

    }

    // ComparisonBasedSort.BogoSort algorithm
    public static int[] BubbleSortAlg(int[] arr) {

        BubbleSort(arr);

        return arr;
    }


}
