package practice_dt.practice01;

import java.util.Scanner;

public class Practice04_ScannerClass {

    public static void main(String[] args) {

          /*
    Ask user to enter the width, length and the height of a rectangular prism then find the volume.
    Volume = width * length * height
     */

        //The First step is to create a Scanner class object
        Scanner input = new Scanner(System.in);

        //2. Step: Give a message to user
        System.out.println("Enter width for calculation....");

        //3.Step: Create a data type container to receive the value from the user
        double width = input.nextDouble();

        System.out.println("Enter length value for calculation....");
        double length = input.nextDouble();

        System.out.println("Enter height value for calculation....");
        double height = input.nextDouble();
/*
        MY CODE
        double volume = width*length*height;
        System.out.println("volume is " + volume);
*/
        //Volume
        System.out.println("Volume is : " + width*length*height );

    }

}
