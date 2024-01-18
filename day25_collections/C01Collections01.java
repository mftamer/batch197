package day25_collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class C01Collections01 {

    /*
        1) Arraylists and LinkedLists are child classes of List Interface
        2) ArrayLists are successful in search operations, but LinkedList are not successful in search operations.
        3) LinkedLists are successful in adding and removing operations, but ArrayLists are not successful in those
            operations.
        4) LinkedLists have "nodes" not "elements"
            "Nodes" have two parts;
                i)data
                ii)pointer(address)
            First node is pointed by "head" and "last node(tail)" points null.
     */

    public static void main(String[] args) {

        ArrayList<Integer> listArr = new ArrayList<>();

        LinkedList<Integer> myList = new LinkedList<>();

        myList.add(5); //[5]
        myList.add(1,8); //[5, 8]
        myList.add(2,12); //[5, 8, 12]
        myList.addLast(7); //[5, 8, 12, 7]

        System.out.println(myList); //[5, 8, 12, 7]

        myList.remove((Integer) 12); //to remove specific element
        System.out.println(myList); //[5, 8, 7]
        System.out.println(myList.remove()); //5 ---> Retrieves and removes the head (first element) of this list
                                                //Shows the removed element ---> "Cut-Paste"
        System.out.println(myList); //[8, 7]

        int removedNode = myList.removeFirst(); //Removes and returns the first element from this list.
        System.out.println("removedNode = " + removedNode); //removedNode = 8

        myList.add(34);
        myList.add(3);
        myList.add(4);
        myList.add(8);

        System.out.println("myList = " + myList); //myList = [7, 34, 3, 4, 8]

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(8);
        list2.add(3);
        list2.add(34); //[8,3,34]

        myList.removeAll(list2);
        System.out.println(myList); //[7, 4]

        myList.add(10);
        myList.add(7);
        myList.add(10);
        myList.add(3);
        myList.add(10);

        System.out.println("myList = " + myList); //myList = [7, 4, 10, 7, 10, 3, 10]
        myList.removeFirstOccurrence(7); //Removes the first occurrence of the specified element in this list (when
                                                // traversing the list from head to tail). If the list does not contain
                                                // the element, it is unchanged.
        System.out.println("myList = " + myList); //myList = [4, 10, 7, 10, 3, 10]
        myList.removeLastOccurrence(10);
        System.out.println("myList = " + myList); //myList = [4, 10, 7, 10, 3]
    }

}
