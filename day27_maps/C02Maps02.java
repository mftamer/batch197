package day27_maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class C02Maps02 {

    /*
    Example 1: Type code to find the number of occurrences of words in a sentence
               Java is easy, Java is OOP, OOP makes Java easy. ==> Java=3, is=2, easy=2, oop=2, makes=1
    */

    public static void main(String[] args) {

        String str = "Java is easy, Java is OOP, OOP makes Java easy.";
        //To store the result, we need a Map.
        Map<String,Integer> result = new HashMap<>();

        //remove punctuation marks
        str = str.replaceAll("\\p{Punct}","");
        System.out.println(str); //Java is easy Java is OOP OOP makes Java easy

        //use split() method to get words
        String [] words = str.split(" ");
        System.out.println(Arrays.toString(words)); //[Java, is, easy, Java, is, OOP, OOP, makes, Java, easy]

        //use loop to count the number of words.
        for (String w:words){
            Integer numOcc = result.get(w);
            if (numOcc==null){
                result.put(w,1);
                System.out.println(result);
            }else {
                result.replace(w,numOcc+1);
                //result.replace(w,numOcc++); wont work because of post-increment
                //result.replace(w,++numOcc); will work because of pre-increment

                System.out.println(result);
            }
        }



    }
}
