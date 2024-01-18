package day25_collections;

import java.util.ArrayList;
import java.util.List;

public class NameRunner {

    public static void main(String[] args) throws IllegalNameException {
        List<String> names = new ArrayList<>();
        addName(names,"Tom");
        addName(names,"4Tom");


        System.out.println(names);
    }

    //Create a method that adds given name to a class list
    public static void addName(List<String> list, String name )throws IllegalNameException{
        char initial = name.charAt(0);
        if (initial>64 && initial<123){  //or initial >= 'A' && initial <= 'z'
            list.add(name);
        }else {
            throw new IllegalNameException("Names must start with letters");
        }

    }
}