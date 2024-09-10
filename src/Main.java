import ComparisonBasedSort.BogoSort;
import ComparisonBasedSort.BubbleSort;
import ComparisonBasedSort.InsertionSort;
import ComparisonBasedSort.SelectionSort;
import NonComparisonBasedSort.CountingSort;

public class Main {
    public static void main(String[] args) {

        System.out.println("Test run for each mentioned Comparison sorting algorithm");

        int[] nums1 = {3, 2, 5, 1, 4, 10 , 12, 7};

        //Bogo Sort
        BogoSort BogoSorter = new BogoSort();
        int[] retNumsBogo =  BogoSorter.BogoSortAlg(nums1);
        System.out.println("sorted array with BogoSort: ");
        for (int i = 0; i < retNumsBogo.length; i++) {
            if(i != retNumsBogo.length - 1) {
                System.out.print(retNumsBogo[i] + ", ");
            }
            else {
                System.out.print(retNumsBogo[i] + "\n");
            }
        }


        int[] nums2 = {3, 2, 5, 1, 4, 10 , 12, 7};
        //Bubble Sort
        BubbleSort BubbleSorter = new BubbleSort();
        int[] retNumsBubble =  BubbleSorter.BubbleSortAlg(nums2);
        System.out.println("sorted array with BubbleSort: ");
        for (int i = 0; i < retNumsBubble.length; i++) {
            if(i != retNumsBubble.length - 1) {
                System.out.print(retNumsBubble[i] + ", ");
            }
            else {
                System.out.print(retNumsBubble[i] + "\n");
            }
        }


        int[] nums3 = {3, 2, 5, 1, 4, 10 , 12, 7};
        //Insertion Sort
        InsertionSort InsertionSorter = new InsertionSort();

        int[] retNumsInsert =  InsertionSorter.InsertionSortAlg(nums3);
        System.out.println("sorted array with InsertionSort: ");
        for (int i = 0; i < retNumsInsert.length; i++) {
            if(i != retNumsInsert.length - 1) {
                System.out.print(retNumsInsert[i] + ", ");
            }
            else {
                System.out.print(retNumsInsert[i] + "\n");
            }
        }

        int[] nums4 = {3, 2, 5, 1, 4, 10 , 12, 7};
        //Selection Sort
        SelectionSort SelectionSorter = new SelectionSort();

        int[] retNumsSelect =  SelectionSorter.SelectionSortAlg(nums4);
        System.out.println("sorted array with SelectionSort: ");
        for (int i = 0; i < retNumsSelect.length; i++) {
            if(i != retNumsSelect.length - 1) {
                System.out.print(retNumsSelect[i] + ", ");
            }
            else {
                System.out.print(retNumsSelect[i] + "\n");
            }
        }


        int[] nums5 = {3, 2, 5, 1, 4, 10 , 12, 7};
        //Counting Sort
        CountingSort CountingSorter = new CountingSort();

        int[] retNumsCounting =  CountingSorter.CountingSortAlg(nums5);
        System.out.println("sorted array with CountingSort: ");
        for (int i = 0; i < retNumsCounting.length; i++) {
            if(i != retNumsCounting.length - 1) {
                System.out.print(retNumsSelect[i] + ", ");
            }
            else {
                System.out.print(retNumsSelect[i] + "\n");
            }
        }


    }



}