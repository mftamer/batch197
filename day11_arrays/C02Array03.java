package day11_arrays;

import java.util.Arrays;

public class C02Array03 {

    public static void main(String[] args) {

        //Example 5: Create an integer array and print all the elements less than 5
        //           [12, 3, -3, 5, 23] ==> 3, -3

        int [] arr = {12,3,-3,5,23};

        // int lessThanFive = arr[0]; ---> This line was in my code, but we don't need it

        for (int w:arr) {
            if (w<5) {
                System.out.print(w + " ");
            }
        }
        System.out.println("");
        //Example: Check if a specific element exists in an Array.

        int [] numbers = {12,3,14,5,23};
        System.out.println(Arrays.binarySearch(numbers, 3)); //binarySearch() return index of the element if it exists
                                                                    // before using binarySearch(), sort the array
                                                                    // If there are repeating elements you can not use binarySearch()

        Arrays.sort(numbers); // {3,5,12,14,23}
        int idxOfElement = Arrays.binarySearch(numbers,14);
        System.out.println("idxOfElement = " + idxOfElement);           //Sort the binarySearch() to make process faster and correct.

        //If an Element does not exist in the Array binarySearch() return "-3" "-" means ----> does not exist
        //                                                                 "3" means ----> order if it would exist


        /*
        for (int q:arr) {
            if (q==5) {
                System.out.println("It exists");
            }

        }

         */






    }

}
