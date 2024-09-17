package my_own_exercise;

import java.util.Scanner;

public class dec_12 {

    public static void main(String[] args) {

        /*
        Ask user to enter a name and a character,
        then check how many times the character is repeated in the name using loops in the name

       e.g:

      char ch1= 'a' ;

      String name ="John came late"

      Expected Output: Number of a = 2
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.nextLine().toLowerCase();
        System.out.println("Enter a character");
        char ch = input.next().toLowerCase().charAt(0);

        int count =0;
//        for(int i=0 ; i<name.length() ; i++){
//            if(name.charAt(i)==ch){
//                count++;
//            }
//        }
//        System.out.println("We have "+count+" times "+ch);
        int i = 0;
        while (i<name.length()){
            if(name.charAt(i)==ch){
                count++;
            }
            i++;
        }
        System.out.println("We have "+count+" times "+ch);






    }
}

