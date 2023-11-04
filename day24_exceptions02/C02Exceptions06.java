package day24_exceptions02;

import java.io.FileInputStream;
import java.io.IOException;

public class C02Exceptions06 {

    /*
        "throw": keyword, is used to push out Exception, it gets blocked.
                is used in method body
                can be used several times in method body
                after throw we create the Exception object
                after throw a single constructor can be used
        "throws": keyword, is used to handle exception.
                is added to method signature
                is used only once
                after throws we add Class name
                after throws several Class-names can be used
 */

    public static void main(String[] args) throws IOException {
        printAge(34);
    //printAge(-34);
        readAndPrintFile();
    }

    // Create a code that prints given age
    public static void printAge (int age){
        if (age>=0){
            System.out.println(age);
        }else {
            throw new IllegalArgumentException("Age cannot be less than 0");
        }

    }

    //Create a method that will read a text file

    public static void readAndPrintFile() throws IOException {
        // way to reach a file

        FileInputStream fis = new FileInputStream("day24_exceptions02/MyFile.txt");

        // way to read a file

        int k = 0;
        while ((k = fis.read()) != -1) {
            System.out.print((char) (k));
        }


    }

}









