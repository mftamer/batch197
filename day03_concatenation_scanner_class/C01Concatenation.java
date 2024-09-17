package day03_concatenation_scanner_class;
public class C01Concatenation {

    public static void main(String[] args) {



    /*Concatenation: It is the process of adding Strings or String with other data types
                     Its symbol is "+"
                     To differentiate concatenation and additions add "" (quotation)
                     eg: "3"+"4"
    */


        String name = "Tom";
        String lastName = "Hanks";
        String fullName = name+" "+lastName;
        System.out.println("fullName = " + fullName);

        System.out.println("Tom" + "Hanks");// TomHanks
        System.out.println("Tom " + "Hanks");// Tom Hanks
        System.out.println("Tom" + " Hanks");// TomHanks
        System.out.println("Tom" +" "+ "Hanks");// Tom Hanks

        System.out.println("Tom" + 4 + 9); //Tom49, because of the quotation on first character, Java will act everything as a combination of characters
        System.out.println(4 +9 +"Tom"); //13Tom, because Java will tend to do the math expression first
        System.out.println("Tom" + (4 + 9)); //Tom13

        System.out.println("Tom" + 3 * 5); //Tom15; it will do multiplication first
        System.out.println(5+9+"Tom" ); //14Tom

        System.out.println(3+5*2+"Tom"+4+2); //13Tom42


    }



}






