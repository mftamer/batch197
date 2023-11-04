package day03_concatenation_scanner_class;

import java.util.Scanner;

public class C05ScannerClass04 {
    public static void main(String[] args) {
        //Example 2: Ask user to enter the width and the length of a rectangle, then print the area and perimeter on the console

        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the width of the rectangle
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        // Ask the user to enter the length of the rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        /*
        ASK THE USER TO ENTER THE LENGTH AND WIDTH TOGETHER
            System.out.print("Enter the width and length of the rectangle: ");
            double width = scanner.nextDouble();
            double length = scanner.nextDouble();
         */

        // Calculate the area and perimeter of the rectangle
        double area = width * length;
        double perimeter = 2 * (width + length);

        // Print the results
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);


    }
}
