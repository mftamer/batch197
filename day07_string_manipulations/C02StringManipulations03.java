package day07_string_manipulations;

public class C02StringManipulations03 {

    public static void main(String[] args) {

        //Example 3: Type code to print just the unique characters in a String
        //           "Hello" ==> Heo

        String word = "Hello";
        String unique = "";
        int firstOccrH = word.indexOf('H');
        int lastOccrH = word.lastIndexOf('H');

        if (firstOccrH==lastOccrH){
            System.out.print("H");
            unique=unique + "H";
        }

        int firstOccrE = word.indexOf('e');
        int lastOccrE = word.lastIndexOf('e');

        if (firstOccrE==lastOccrE){
            System.out.print("e");
            unique=unique + "e";
        }

        int firstOccrL = word.indexOf('l');
        int lastOccrL = word.lastIndexOf('l');

        if (firstOccrL==lastOccrL){
            System.out.print("l");
            unique=unique + "l";
        }

        int firstOccrO = word.indexOf('o');
        int lastOccrO = word.lastIndexOf('o');

        if (firstOccrO==lastOccrO){
            System.out.println("o");
            unique=unique + "o";
        }

        System.out.println("unique = " + unique); //unique = Heo

        //println will go to the next line, but print will print right after the previous one



    }

}
