package day28_iterators_lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class C02Iterators {
/*
    1) "Iterators" are used in Collection.
    2) "Iterators" do the same thing with loops.
    3) In terms of performance, there is no difference between them.
    4) In "Iterators" we avoid the possibility of infinite loop.
    5) "Iterators" are good at removing and updating Collection elements.
    6) There are two types of "Iterator":
        i) Iterator: It can be used to "remove" elements from Collection.
                     It has one direction ---> left to right
        ii) ListIterator: It can be used to remove and update elements of Collection.
                          It has two directions.
 */
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Angie");
        myList.add("Mark");
        System.out.println(myList); //[Tom, Jim, Clara, Angie, Mark]

        Iterator<String> itr = myList.iterator();

        /*
            next(): Returns the next element in the iteration.
            remove(): Removes from the underlying collection the last element returned by this iterator (optional
                        operation). This method can be called only once per call to next.
            hasNext(): Returns true if the iteration has more elements. (In other words, returns true if next
                       returns an element rather than throws an exception.)
         */
        /*
        String el=itr.next();
        String el2=itr.next();
        itr.remove();
        System.out.println(el); //Tom
        System.out.println(el2); //Jim
        System.out.println(myList); //[Tom, Clara, Angie, Mark]
*/
        //Remove all elements from myList:
        while (itr.hasNext()) {
            itr.next();
            itr.remove();
        }

        System.out.println(myList); //[]


        //Remove all elements except "Clara"

        List<String> list2 = new ArrayList<>();
        list2.add("Tom");
        list2.add("Jim");
        list2.add("Clara");
        list2.add("Angie");
        list2.add("Mark");
        System.out.println(list2); //[Tom, Jim, Clara, Angie, Mark]

        Iterator<String> itr2 = list2.iterator();

        while (itr2.hasNext()){
            String el = itr2.next();
            if (el != "Clara"){
                itr2.remove();
            }
        }
        System.out.println(list2); //[Clara]

        // ListIterator:

        List<String> list3 = new ArrayList<>();
        list3.add("Tom");
        list3.add("Jim");
        list3.add("Clara");
        list3.add("Angie");
        list3.add("Mark");
        System.out.println(list3); //[Tom, Jim, Clara, Angie, Mark]

        ListIterator<String> litr = list3.listIterator();
        //litr.set(); //Replaces the last element returned by next or previous with the specified element (optional
                        // operation).

        //How to update Collection elements by ListIterator:
        //Let's put "*" at the end of every element

        while (litr.hasNext()){
            String el = litr.next();
            litr.set(el+"*");
        }
        System.out.println(list3); //[Tom*, Jim*, Clara*, Angie*, Mark*]

        //System.out.println(litr.hasNext()); //False. No element after Mark

        //System.out.println(litr.hasPrevious()); //true

        //String el = litr.previous(); //Mark*

        //Lets print elements in reverse order
        while (litr.hasPrevious()){
            System.out.print(litr.previous() + " "); //Mark* Angie* Clara* Jim* Tom*

        }

    }
}
