package day10_loops_arrays;

import java.util.Scanner;

public class C01DoWhileLoop01 {

    public static void main(String[] args) {

        /*
        Ask user to enter an integer.
        If the integer is less than 100, tell user "Won!"
        Otherwise, tell user "Lost!"
         */


        //SCOPE IS CALLED BETWEEN CURLY BRACKETS.
        // ANYTHING DECLARED IN THAT SCOPE STAYS IN THAT SCOPE ONLY.
        //BUT THERE IS A HIGHER LEVEL OF SCOPES SUCH AS DO'S SCOPE IS HIGHER THAN IF BECAUSE
        //              DO'S CURLY BRACKETS COVER IF STATEMENT AS WELL.
        /*
          EXAMPLE;  {1
                            {   2
                                    {   3
                                     3   }
                                         2       }
                                                            1}
                   Bracket 1 covers everything, so its scope is higher. Do can use other variables given/mentioned in
                                Bracket 2 and 3.
         */

        int num;

        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Please Enter a number:");
            num = input.nextInt();   //We didn't write 'int num' because 'num' is already declared before.


            if(num<100){
                System.out.println("You Won!");
            }

        } while (num<100);
        System.out.println("You Lost!");


        //Select everything then click on forward slash, while holding ctrl, abd everything will be comment out

        //Second Way:
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Please Enter a number:");
            num = input.nextInt();

            if (num>=100) {
                System.out.println("You Lost!");
                break;
            }
            System.out.println("You Won!");

        } while (true);





    }


}
