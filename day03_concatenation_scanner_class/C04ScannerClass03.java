
package day03_concatenation_scanner_class;

import java.util.Scanner;

public class C04ScannerClass03 {

    public static void main(String[] args) {
//Example 1: Ask user to enter 2 numbers, then print the sum and the multiplication of the numbers on the console.

        Scanner input = new Scanner(System.in);

        // Ask for the first number input
        System.out.println("Please enter a number:.....");
        double firstNo = input.nextDouble();

        // Ask for the second number input
        System.out.println("Please enter second number:.....");
        double secondNo = input.nextDouble();

        //Addition of inputted numbers
        double sum = firstNo + secondNo;

        //Multiply of inputted numbers
        double multiply = firstNo*secondNo;

        System.out.println("Sum of the numbers is = " + sum);
        System.out.println("multiplication of numbers is  = " + multiply);
        System.out.println("Sum of the numbers is = " + sum + " and multiplication of numbers is  = " + multiply );
        System.out.println("Sum of " + firstNo +" and" +secondNo + " is " + sum + " and multiplication of numbers is  = " + multiply );



    }


}

