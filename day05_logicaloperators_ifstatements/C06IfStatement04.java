package day05_logicaloperators_ifstatements;

import java.util.Scanner;

public class C06IfStatement04 {

    public static void main(String[] args) {

        //Example 5: Type java code by using if-else if() statement.
        //A school has rules for the grading system:
        //1. Below 50 - D     2. 50 to 59 - C       3. 60 to 79 - B.     4. From 80 to 100 - A
        //Ask user to enter marks and print the corresponding grade.


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your grade.");

        byte mark = input.nextByte();
        if (mark<0) {
            System.out.println(("Mark of a student cannot be less than zero"));
        } else if (mark<50) {
            System.out.println("Your Grade is : D");
        } else if (mark<60){
            System.out.println("Your Grade is : C");
        }else if (mark<80) {
            System.out.println("Your Grade is : B");
        }else if (mark<101) {
            System.out.println("Your Grade is : A");
        }else{
            System.out.println("You are a superstar!");
        }


    }

}
