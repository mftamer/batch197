package day23_exceptions;

public class C03Exceptions03 {

    public static void main(String[] args) {
    String[] str = {"Fatih","Kadir", "Emrey","Sloane"};
    printElementOnConsole(str,0); // Fatih
    printElementOnConsole(str,4); // Exception - ArrayIndexOutOfBoundsException
                                        // When an index which is equal or greater than the length of the Array.
        System.out.println((convertStringToInteger("123") + 1));
        System.out.println((convertStringToInteger("0") + 1));
        System.out.println((convertStringToInteger("-4") + 1));
        System.out.println((convertStringToInteger("12a4") + 1)); // Java throws NumberFormatException
                                                                    //When we try to convert non-digit chars to integer
    }

    //Type a method to print the element from a given array on the console:
    public static void printElementOnConsole(String[] s, int idx){
        try{
            System.out.println(s[idx]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Given index is invalid for the Array!"); //Given index is invalid for the Array!
            System.out.println(e.getMessage()); //Index 4 out of bounds for length 4
        }
    }

    //Type a method that converts a given String to an Integer
    public static Integer convertStringToInteger(String str){
       int result = 0;
        try {
           return Integer.valueOf(str);
       }catch (NumberFormatException e){
            System.out.println("String you entered contains some non-digit characters!");
        }
        return result;
    }
}
