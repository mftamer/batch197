package day06_switch_ternary_stringmanipulations;

public class C05StringManipulations {

    public static void main(String[] args) {

        /*
        ---------------REGULAR EXPRESSIONS--------------------
        i) If we handle a group of data, we use regex
        - All uppercase letters               : [A-Z]
        - All lowercase letters               : [a-z]
        - All letters                         : [A-Za-z]
        - All digits                          : [0-9]
        - All letters from b to m             : [b-m]
        - Group of letters akmre              : [akmer] ----> Order is not important
        - All chars except Uppercase letters  : [^A-Z]
        - All chars except Uppercase letters  : [^a-z]
        - All chars except letters            : [^A-Za-z]
        - All chars except digits             : [^0-9]
        - All chars except letter and digits  : [^A-Za-z0-9]
        - All punctuation marks               : \\p{Punct}
         */

        //Example 1: Count the alphabetical chars in a given string
        //"Tom12 Hanks!..."

        String name = "Tom12 Hanks!...";
        System.out.println(name.replaceAll("[.!]","*")); //Tom12 Hanks****
        System.out.println(name.replaceAll("[.]","*")); //Tom12 Hanks!***
        System.out.println(name.replaceAll("[21]","*")); //Tom** Hanks!...
        System.out.println(name.replaceAll("[ ]","*")); //Tom12*Hanks!...
        System.out.println(name.replaceAll("[^A-Za-z]","")); //TomHanks
        System.out.println(name.replaceAll("[^A-Za-z]","").length()); //8

        // replaceAll() ---> replaces group of data from string with something else.
        // length() ---> counts the number of chars in a string

        // Example 2: Write a code to change all numbers by * in a given password

        String password = "a126Rd?q5";
        String hiddenPass = password.replaceAll("[0-9]", "*");
        System.out.println(hiddenPass); //a***Rd?q*

        // Example 3: Get initials from full name: (Middle names are excluded)
        //"Tom Hanks" ---> TH
        //"toM Hanks" ---> TH
        //"tOm hAnKs" ---> TH

        //To get certain piece use substring
        String name2 = "tOm hAnKs";
        System.out.println(name2.substring(0, 1)); //t             (0,1) --> 0 is included 1 is excluded
        System.out.println(name2.substring(1, 5)); //Om h          t -->0  O--->1 m--->3 ....etc...
        System.out.println(name2.substring(4, 8)); //hAnK
        System.out.println(name2.substring(4, 9)); //hAnKs

        // How to get first initial
        String firstInitial = name2.substring(0, 1).toUpperCase();

        // How to get initial of the second letter with examples
        //Split is to cut the string from given place
        System.out.println(name2.split(" ")[1]); //hAnKs ---> Will cut from space(blank), [1] is is index 1 and it starts from 0.
        System.out.println(name2.split(" ")[0]); //tOm
        System.out.println(name2.split("m")[0]); //tO
        System.out.println(name2.split("m")[1]); // hAnKs
        System.out.println(name2.split("A")[1]); //nKs
        System.out.println(name2.split("A")[0]); //tOm h
        System.out.println(name2.split("A")[1]); //nKs

        String secondInitial = name2.split(" ")[1].substring(0,1).toUpperCase();
        System.out.println(firstInitial+secondInitial);

        //Trim methods. If you have space before or after the names. for eg: "   tOm hAnKs   "
        String name3 = "   tOm hAnKs   ";

        String trimFirstInitial = name3.trim().substring(0, 1).toUpperCase();


    }

}
