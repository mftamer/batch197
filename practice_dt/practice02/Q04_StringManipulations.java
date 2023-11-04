package practice_dt.practice02;

public class Q04_StringManipulations {

    public static void main(String[] args) {

        //1.Task: Count the alphabetical characters in a given String value.

        String str= "Wow! Edip is grown up and even if he is 13 years old he will go his 2nd university...";

        int totalNumOfChars=str.length();

        System.out.println("totalNumOfChars = " + totalNumOfChars); //85

        String strWithoutPunct = str.replaceAll("\\p{Punct}", "");
        System.out.println("strWithoutPunct = " + strWithoutPunct);

        String onlyLetters = strWithoutPunct.replaceAll("[^A-Za-z]", "");
        System.out.println("onlyLetters = " + onlyLetters);
        
        int totalNumOfLetters = onlyLetters.length();
        System.out.println("totalNumOfLetters = " + totalNumOfLetters);
        


    }

}
