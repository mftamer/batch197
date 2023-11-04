package day09_loops;

public class C07DoWhileLoop01 {

    public static void main(String[] args) {

        /*
        WHILE LOOP
        int i =1;
        while (condition){
        code;
        increment/decrement;
        }

        DO WHILE LOOP
        int i=1;
        do{
        code;
        increment/decrement ;
        }
        while (condition)


         */

        int i =1;
        while(i<1){
            System.out.println("I am while loop....");
            i++;
        }

        int k=1;
        do {
            System.out.println("I am Do While loop....");
            k++;
        } while (k<1);

        /*
        Note 1: Zero Execution is possible for while-loop, but it is not possible for do-while loop
        Note 2: do-while loop body is executed at least once.
        Note 3: do-while loop is good to use game creation.
        */


        //Example: Type a code to reverse a String
        // "Tom Hanks" -----> "sknaH omT"

        String str = "Tom Hanks";
        String reverse = "";

        int j = str.length()-1;
        do {
            reverse = reverse + str.charAt(j);
            j--;
        } while (j>=0);
        System.out.println(reverse);




    }

}
