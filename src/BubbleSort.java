import java.util.*;

//Compare pairs of adjacent elements, swap adjacent elements if they are not in order, repeat until no swaps are needed

//Best case: already sorted O(n)
//Worst case: sorted in reverse order O(n^2)
public class BubbleSort {
    private static void BubbleSort(int[] arr) {
        boolean repeat = true;
        while(repeat){
            repeat = false;
            for(int i = 1; i < arr.length-1; i++){
                if(arr[i] < arr[i-1]){
                    int x = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = x;
                    repeat = true;
                }
            }
        }

    }

    // BogoSort algorithm
    public static int[] BubbleSortAlg(int[] arr) {
        while (!Main.isSorted(arr)) {
            BubbleSort(arr);
        }
        return arr;
    }


}
