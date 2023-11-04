package day09_loops;

import java.util.Scanner;

public class C08DoWhileLoop02 {

    public static void main(String[] args) {

        //Type a code to find the sum of the integers between 7 and 10.

        int i=7;
        int sum=0; //because 0 has no effect on addition

        do {
            sum = sum +i;
           i++;
        } while (i<11);
        System.out.println(sum);



        // GAME
        /*
        Ask user to enter an integer.
        If the integer is less than 100, tell user "Won!"
        Otherwise, tell user "Lost!"
         */


        int k = 1;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Please enter a number:");
            k = input.nextInt();
            if (k < 100) {
                System.out.println("Won!");
            }
        }
        while (k<100);
            System.out.println("Lost!");

        }




    }



