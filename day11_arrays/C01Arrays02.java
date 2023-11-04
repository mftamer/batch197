package day11_arrays;

import java.util.Arrays;

public class C01Arrays02 {

    public static void main(String[] args) {

        //Example: Find the difference between maximum and min value of array elements
        // [8,12,34,10,78,19]

        /*
        int a = 69;
        int b = 41;
        System.out.println("Math.max(a,b) = " + Math.max(a, b));
        System.out.println("Math.min(a,b) = " + Math.min(a, b));
         */

        int [] arr = {8,12,34,10,78,19}; // Write the members of the array in curly brackets

        int maximum = arr[0];
        int minimum = arr[0];

        for (int w:arr) {
            maximum = Math.max(maximum,w);
            minimum = Math.min(minimum,w);

        }
        System.out.println(maximum);
        System.out.println(minimum);
        System.out.println(maximum-minimum);


        //Example 3: Create a String Array, add 5 elements in it, find the sum of the number of characters in all Strings

        String [] cities = {"London" , "New York" , "Dares Salaam", "Istanbul", "Athens"};
        int numChars = 0;

        for (String w: cities) {
            numChars = numChars + w.length();
        }
        System.out.println(numChars);


        //Note 1: Arrays can contain only primitive data types and references
        //Note 2: String uses length() mtd. but Arrays uses length variable
        //Methods are actions, Array uses length like a key word because you have already declared how long it is

        int [] brr = new int [6];

        //Example 4: [0, 2, 3, 0, 12, 0] put the zeros to the end ==> [2, 3, 12, 0, 0, 0]
        int [] crr = {0,2,3,0,12,0};
        int [] newCrr = new int[crr.length];
        int idx = 0;
        //default value for numerical data type is 0. for alphabetical (String) is null.

        for (int w: crr) {
            if (w!=0){
                newCrr[idx] = w;
                idx++;
            }
        }
        System.out.println(Arrays.toString(newCrr));


    }

}
