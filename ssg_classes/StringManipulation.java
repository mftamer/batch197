package ssg_classes;

public class StringManipulation {

    public static void main(String[] args) {


        // Q 1: Write a Java code snippet to convert the first character of a string to uppercase.
        String str = "hello";
        String firstChar = Character.toUpperCase(str.charAt(0)) + str.substring(1);
        System.out.println(firstChar);

        //Q 2: Write a Java code to count the occurrences of a character in a string.
        String str1 = "Learn from your mistakes and use them as opportunities for growth.";
        char target = 'o';
        int count = 0;
        for (int i = 0; i< str1.length(); i++){
            if (str1.charAt(i) == target){
                count++;
            }
        }
        System.out.println(count);

        //Q 3: Write a Java code snippet to count the number of words in a string.
        String str2 = "Set clear goals and work towards them consistently.";
        String[] words = str2.split("\\s");
        int worCount = words.length;
        System.out.println(worCount);

        //Q 4: How do you split a string into an array of substrings using a delimiter in IntelliJ?
        String str3 = "Hello,World,Java";
        String[] substrings = str3.split(",");
        for (String substring : substrings) {
            System.out.println("Substring: " + substring);
        }

        //Q 5: How can you check if a string starts with a specific prefix in IntelliJ?
        String str4 = "Never give up on your dreams and aspirations. ";
        String prefix = "Never";
        boolean star = str4.startsWith(prefix);
        System.out.println("Starts with prefix? " + star);



        //Q 6: Write a Java code snippet in IntelliJ to find the index of the first and last
        // occurrence of a character in a string.
        String str5 = "Believe in yourself and your potential.";
        char target1 = 'o';

        int fI = str.indexOf(target1);
        int LI = str.lastIndexOf(target1);
        System.out.println("Index of '" + target1 + "': " + fI);
        System.out.println("Index of '" + target1 + "': " + LI);



    }

}
