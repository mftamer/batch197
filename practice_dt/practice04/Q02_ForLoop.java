package practice_dt.practice04;

public class Q02_ForLoop {

    public static void main(String[] args) {

        //*** INTERVIEW QUESTION ***

        //type code to print divisible numbers in an array

        int [] numbers = {12,25,36,48,72,89};

        int divisor = 12;

        for (int w:numbers){

            if (w%divisor==0){
                System.out.print(w +" "); //12 36 48 72
            }

        }


    }

}
