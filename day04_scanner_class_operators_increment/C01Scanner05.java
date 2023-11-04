package day04_scanner_class_operators_increment;

import java.util.Scanner;

public class C01Scanner05 {

    public static void main(String[] args) {

        //Example 3: Ask user to enter i)Full name ii) Age iii) Height iv) Marital status
        //           Then print them on the console in different lines with a label

        //First: Create Scanner Class:
        Scanner input = new Scanner(System.in);

        //Second: Give a message to user:

        System.out.println("Please Enter Your Full Name:....");
        String fullName = input.nextLine();

        System.out.println("Please Enter Your Age:....");
        byte age = input.nextByte();

        System.out.println("Please Enter Your Height:....");
        int height = input.nextInt();

        System.out.println("Please Enter Your Marital Status:....");
        String status = input.next();

        System.out.println("Your full name is " + fullName);
        System.out.println("Your age is " + age);
        System.out.println("Your height is " + height);
        System.out.println("Your marital status is " + status);
    }


}
