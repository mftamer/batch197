package day03_concatenation_scanner_class;

import java.util.Scanner; //to import util package and scanner class

public class C02ScannerClass01 {

    public static void main(String[] args) {

        /*  Scanner Class: When input is requested from the user.
                Steps are followed to get data from user;
                    1) Create Scanner Class object
                        a) Name the object
                        b) Assignment operator
                        c) New key word
         */

        Scanner input = new Scanner(System.in); // on scanner alt+enter then click to import scanner class
                                                // System.in is to input data from the user. Type the system in

        //          2) Write a message to user
        System.out.println("Please Enter Your Age:....."); //when you run it, you should write an age on the bottom part

        //          3) Get data from user
        byte age = input.nextByte(); // to keep it in a container

        System.out.println("Your age is : " + age);

    }





}
