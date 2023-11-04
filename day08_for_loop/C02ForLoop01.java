package day08_for_loop;

public class C02ForLoop01 {

    public static void main(String[] args) {

        // Type "Hi" 5 times on the console.

        //Typing like below is difficult to type, to update, to fix bugs in it.
        //It has many repetitions.
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        //Try to avoid repetitions.
        // Java created loop to make repeating actions easy
        /*
        There are 4 types of loops;
        i) For Loop
        ii) While Loop
        iii) Do While Loop
        iv) For Each Loop
         */

        System.out.println("Before loop.........");

        //For Loop: ----> takes three parameters
        //   starting point        condition         increment/decrement part
        for (   int i = 1;            i<6        ;            i++    ) {

            System.out.println("Hi");

        }

        //Example 2: Type code to print numbers from 15 to 4 on the console on the same line

        for (int i=15; i>3 ; i-- ){
            System.out.print(i + " ");

        }

    }

}
