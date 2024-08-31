import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Test run for each mentioned Comparison sorting algorithm");

        int[] nums = {3, 2, 5, 1, 4, 10 , 12, 7};

        //Bogo Sort
        BogoSort BogoSort = new BogoSort();
        int[] retNumsBogo =  BogoSort.BogoSortAlg(nums);
        System.out.println("sorted array with BogoSort: ");
        for (int i = 0; i < retNumsBogo.length; i++) {
            if(i != retNumsBogo.length - 1) {
                System.out.print(retNumsBogo[i] + ", ");
            }
            else {
                System.out.print(retNumsBogo[i] + "\n");
            }
        }

        //Bubble Sort
        BubbleSort BubbleSort = new BubbleSort();
        int[] retNumsBubble =  BogoSort.BogoSortAlg(nums);
        System.out.println("sorted array with BubbleSort: ");
        for (int i = 0; i < retNumsBubble.length; i++) {
            if(i != retNumsBubble.length - 1) {
                System.out.print(retNumsBubble[i] + ", ");
            }
            else {
                System.out.print(retNumsBubble[i] + "\n");
            }
        }

    }

    //check if is sorted
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]) {
                return false;
            }
        }
        return true;
    }
}