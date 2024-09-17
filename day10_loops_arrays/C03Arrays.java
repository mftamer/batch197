package day10_loops_arrays;

import java.util.Arrays;

public class C03Arrays {

    public static void main(String[] args) {

        /*
         When we learn something new, follow these steps:
         1)What?
         2)Why?
         3)Low-level Implementations
         4)Mid-level Implementations
         5)Advanced-level Implementations
         6)Projects

            Arrays are used to store multiple data.
            The Data type of each element must be the same.
            */
        //How to create an Array;
        String [] stdNames = new String[5]; // [null,null,null,null,null]

        //How to print Array on the console
        System.out.println(stdNames); //prints references
        System.out.println(Arrays.toString(stdNames)); // by default, they are all null
                                                        // [null,null,null,null,null]

        System.out.println("Before");

        //How to add elements to the Array:
        stdNames[0] = "Mary";
        System.out.println(Arrays.toString(stdNames)); //[Mary,null,null,null,null]
        stdNames[3] = "John";
        System.out.println(Arrays.toString(stdNames)); //[Mary,null,null,John,null]
        stdNames[1] = "Tom";
        System.out.println(Arrays.toString(stdNames)); //[Mary,Tom,null,John,null]
        stdNames[4] = "Julie";
        System.out.println(Arrays.toString(stdNames)); //[Mary,Tom,null,John,Julie]
        stdNames[2] = "Murat";
        System.out.println(Arrays.toString(stdNames)); //[Mary,Tom,Murat,John,Julie]

        System.out.println("After adding arrays");

        //How to get a specific element from an Array
        String third = stdNames[2];
        System.out.println(third);


        //Example: Create an int Array then find the multiplication of them.

        int [] numbers = new int[4];
        numbers[0] = 12;
        numbers[1] = 5;
        numbers[2] = 4;
        numbers[3] = 2;

        System.out.println(Arrays.toString(numbers));

        //First Way:
        int product = 1;

        for (int i=0; i<numbers.length; i++ ){
            product = product*numbers[i];
        }
        System.out.println(product);

        //Second Way: For Each Loop (Enhanced Loop) ---> works with Arrays and Collections
                        //                         If you need to use indexes, you cannot use it "For Each Loop"

        int n=1; //for the product
        for (int w:numbers){                //[12,5,4,2]
            n=n*w;
        }
        System.out.println(n);

        //Example: Find the difference between maximum and min value of array elements
        // [8,12,34,10,78,19]

        int [] numsArr = {8,12,34,10,78,19};
        System.out.println(Arrays.toString(numsArr));

        System.out.println("After sorting them");
        Arrays.sort(numsArr);
        System.out.println(Arrays.toString(numsArr)); //Ascending order [8, 10, 12, 19, 34, 78]

        int difference = numsArr[numsArr.length-1] - numsArr[0];
        System.out.println("difference = " + difference);




    }

}
