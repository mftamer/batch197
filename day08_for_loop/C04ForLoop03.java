package day08_for_loop;

public class C04ForLoop03 {

    public static void main(String[] args) {

        //Example 6: Type a code to reverse a String (FAMOUS INTERVIEW QUESTION)

        //"Alexa" ----> "axelA"

        String s = "Alexa";
        String reversed = "";

        for (int i=s.length()-1; i>=0; i--){

            reversed = reversed+s.charAt(i);
            System.out.println("reversed = " + reversed);

        }
        System.out.println(reversed);

        //Example 7; Type a code to find the sum of digits in an integer.
        // 587 -----> 5+8+7 = 20

        int num = 587;
        int sum = 0;

        for (int i=num; i>0; i/=10){
            sum = sum + i%10;


        }
        System.out.println("sum = " + sum);

        //Example 8: Type code to find chars in a given String
        // "Hello" ----> "Heo"





    }

}
