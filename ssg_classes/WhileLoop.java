package ssg_classes;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {


        //Question 1: Write a Java program that uses a while loop to calculate the sum of all
        // odd numbers from 1 to 50 (inclusive). Print the final sum.
        int sum = 0;
        int num = 1;
        while (num <=100){
            if (num %2!=0){
                //sum = sum +num;
                sum+=num;
            }
            num++;
        }
        System.out.println("The sum odd numbers from 1 to 50 is: "+sum);

        //Question 2: Write a Java program that asks the user to enter a positive integer
        // and keeps asking until a valid input is provided.
        Scanner scan = new Scanner(System.in);
        int num2;
        while (true){
            System.out.println("Enter a positive integer: ");
            num2 = scan.nextInt();
            if (num2>0){
                break;
            }
            System.out.println("Invalid input. Please try again");

        }

        //Question 3: Write a Java program to reverse a given number or print in revers order using a while loop.
        int num3 = 56482;
        int revNum=0;
        while (num3 !=0){
            int digit = num3 % 10;
            revNum  = revNum * 10 +digit;
            num3 = num3/10;
        }
        System.out.println(revNum);


        //Question 4: Write a program that counts the number of digits in a given number using a while loop.
        //Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number4 = scan.nextInt();

        int count = 0;
        int temp = number4;
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }
        System.out.println("Number of digits: " + count);

    }

}
