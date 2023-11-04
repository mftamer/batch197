package day05_logicaloperators_ifstatements;

import java.util.Scanner;

public class C03IfStatement01 {

    public static void main(String[] args) {

        // If it rains, I will cancel the picnic.
        // If(it rains) { I will cancel the picnic }

        int a=5;
        int b=2;

        if (a%b==1){
            System.out.println("Activated...");
        }

        //Example: Write a code to detect either a given number is odd or even.

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number to check if it is even or odd....");

        int number = input.nextInt();

        //First way
        if(number%2==0){
            System.out.println("The number given is even.");
        }
        if (number%2!=0) {
            System.out.println("The number is odd.");
        }

        //Second Way
        if(number%2==0){
            System.out.println("The number given is even.");
        }else {
            System.out.println("The number is odd.");
        }


        //Example 2: Write a code to check if number is positive, negative or neutral
        System.out.println("Please Enter A Number to Check It's Sign...");
        double num = input.nextDouble();

        if(num<0){
            System.out.println("The number is negative.");
        }else if(num>0) {
            System.out.println("The number is positive.");
        }else{
            System.out.println("The number is neutral.");
        }


    }

}
