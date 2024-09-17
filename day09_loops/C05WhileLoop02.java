package day09_loops;

public class C05WhileLoop02 {

    public static void main(String[] args) {

        //Type a code to print even numbers from 15 to 5

        int i=15;
        while (i>5) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i--;

        }

        System.out.println();
        //Example: Type a code to check if a given number is Palindrome or not
        // 12321 -------> palindrome
        // 12312 -------->not palindrome

        int num = 12321;
        String numStr = String.valueOf(num); // convert int to string ----> "12321"
        String reversed = "";

        int k = numStr.length()-1;
        while (k>=0){
            reversed = reversed + numStr.charAt(k);
            k--;
        }

        System.out.println(reversed); // to check if we reversed correctly

        if (numStr.equals(reversed)){
            System.out.println("Palindrome.");
        }else {
            System.out.println("Not Palindrome.");
        }










    }


}
