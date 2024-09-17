package day08_for_loop;

import java.util.LinkedHashSet;
import java.util.Set;

public class C04ForLoop03 {

    public static void main(String[] args) {

        //Example 6: Type a code to reverse a String (FAMOUS INTERVIEW QUESTION)

        //"Alexa" ----> "axelA"

        String s = "Alexa";
        String reversed = "";

        for (int i = s.length() - 1; i >= 0; i--) {

            reversed = reversed + s.charAt(i);
            System.out.println("reversed = " + reversed);

        }
        System.out.println(reversed);

        //Example 7; Type a code to find the sum of digits in an integer.
        // 587 -----> 5+8+7 = 20

        int num = 587;
        int sum = 0;

        for (int i = num; i > 0; i /= 10) {
            sum = sum + i % 10;


        }
        System.out.println("sum = " + sum);

        //Example 8: Type code to find chars in a given String
        // "Hello" ----> "Heo"
        String str = "Hello";
        String result = removeDuplicateChars(str);
        System.out.println(result); // Output: Heo
    }
        public static String removeDuplicateChars(String str) {
            // Use LinkedHashSet to maintain insertion order
            Set<Character> charSet = new LinkedHashSet<>();
            StringBuilder sb = new StringBuilder();

            for (char c : str.toCharArray()) {
                // If the character is not already in the set, add it to the set and StringBuilder
                if (!charSet.contains(c)) {
                    charSet.add(c);
                    sb.append(c);
                }
            }
            return sb.toString();
        }


    }
