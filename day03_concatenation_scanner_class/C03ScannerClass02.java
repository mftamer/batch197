package day03_concatenation_scanner_class;

import java.util.Scanner;

public class C03ScannerClass02 {

    public static void main(String[] args) {

        /*     Ask Full num of user and print on the console
               to Create a Scanner Class object */

        Scanner input = new Scanner(System.in); //click on scanner while writing sc and Java will import scanner class itself

        // Write a message to the user
        System.out.println("Please Enter Your Full Name:.....");

        //Get data from user
        String fullName = input.nextLine(); //Use nextLine not next. Because next only takes first word.

        System.out.println("Full Name is:" + fullName);

        // Ask user to enter parents first name only
        System.out.println("Please Enter Only First Name of your Parent:......");
        String firstName = input.next();

        System.out.println("First name of your parent is : " + firstName);

    }


}
