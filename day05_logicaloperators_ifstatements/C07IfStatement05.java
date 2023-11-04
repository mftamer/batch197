package day05_logicaloperators_ifstatements;

import java.util.Scanner;

public class C07IfStatement05 {

    public static void main(String[] args) {

        //Nested If Statement
        //Example 6:
        //If a number is even then check if it is divisible by 3 or not.
        //If it is divisible by 3, the output will be “Perfect even number” otherwise, the output will be “Good even number.”
        //If the number is odd, then check if it is divisible by 3 or not.
        //If it is divisible by 3, the output will be “Perfect odd number” otherwise, the output will be “Good odd number.”

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a number...");

        int number = input.nextInt();

        if (number%2==0){
            if (number%3==0){
                System.out.println("Perfect even number.");
            } else {
                System.out.println("Good even number.");
            }
        }else {
            if (number%3==0){
                System.out.println("Perfect odd number.");
            } else {
                System.out.println("Good odd number.");
            }
        }
        // Try to avoid using nested structures in Java
        // They have time complexity. ----> it takes time


    }
}
