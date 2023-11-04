package day13_arraylist_method_creation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class C01Arraylist02 {

    public static void main(String[] args) {

        //FAMOUS INTERVIEW QUESTION

        // Example: Create a Character List which has repeated chars and remove duplicates
        // [J,a,v,a,c] -----> [J,a,v,c]

        ArrayList<Character> a = new ArrayList<>();
        a.add('J');
        a.add('a');
        a.add('v');
        a.add('a');
        a.add('c');

        System.out.println("a = " + a);

        ArrayList<Character> b = new ArrayList<>();
        System.out.println("b = " + b);

        for (Character w:a){
            if (!b.contains(w)) { //If it doesn't exist
                b.add(w);
            }
        }
        System.out.println(b);


        //FAMOUS INTERVIEW QUESTION

        //Example 4: Find the closest 2 integers in the given list.
        //           [20, 15, 14, 11, 19] ==> 14-15, 19-20

        ArrayList<Integer> c = new ArrayList<>();
        c.add(20);
        c.add(15);
        c.add(14);
        c.add(11);
        c.add(19);
        System.out.println("c = " + c); // c = [20, 15, 14, 11, 19]

        //sort them before everything
        //Find difference first, then find minimum difference and finally which elements have minimum difference

        Collections.sort(c); //This is how it works in ArrayList

        System.out.println("c = " + c);

        //Second and third step; find the difference and the minimum difference

        int minDiff = c.get(1)-c.get(0); //3
        for (int i =1; i<c.size(); i++){
            if (c.get(i)-c.get(i-1)<minDiff){
                minDiff =c.get(i) - c.get(i-1);
            }
        }
        System.out.println("minDiff = " + minDiff);

        //last step: find element that they have minDiff among them.

        for (int k =1; k<c.size(); k++){
            if (c.get(k)-c.get(k-1) == minDiff) {
                System.out.println(c.get(k-1) + " and " + c.get(k));

            }
            }
    }


}
