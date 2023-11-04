package day09_loops;

public class C02ForLoop05 {

    public static void main(String[] args) {

        /*
        Example 8: Print the following structure on the console
            Week: 1
              Day: 1
              Day: 2
              Day: 3
            Week: 2
              Day: 1
              Day: 2
              Day: 3
         */

        int week = 2;
        int days = 3;

        for (int i=1; i<=week; i++){
            System.out.println("Week; " +i);
            for (int k=1; k<=days; k++){
                System.out.println("  Day: "+k);
            }
        }










    }

}
