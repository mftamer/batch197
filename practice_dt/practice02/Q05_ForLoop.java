package practice_dt.practice02;

public class Q05_ForLoop {

    public static void main(String[] args) {

        //Type a code to print all integers from 10 to 32 except if the integer is less than 21 greater than 18

        for (int i=10; i<33; i++) {

            if (i>18 && i<21){

                continue;

            }
            System.out.print(i + " ");
        }


    }

}
