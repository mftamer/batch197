package day26_collections02;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class C02Queue {
    /*
        1) Whenever you need to use "FIFO" (First In First Out) scenarios, remember to use "Queue"
        2) You have 2 options to use "Queue";
            i) LinkedList: Insertion order
            ii) PriorityQueue: Use priority order.
        3) "Deque" is an interface, stands for Double-Ended Queue, use it whenever you need FIFO and LIFO
     */
    public static void main(String[] args) {

        Queue<String> food = new LinkedList<>();
        food.add("Meat");
        food.add("Cheese");
        food.add("Milk");
        food.add("Egg");
        food.add("Candy");
        food.add("Candy");
        System.out.println(food); //[Meat, Cheese, Milk, Egg, Candy, Candy]

        PriorityQueue<String> f = new PriorityQueue<>();
        f.add("Meat");
        f.add("Cheese");
        f.add("Milk");
        f.add("Egg");
        f.add("Candy");
        f.add("Candy");
        System.out.println(f); //[Candy, Cheese, Candy, Meat, Egg, Milk]

        Deque<String> d = new LinkedList<>();
        d.addFirst("A");
        d.addFirst("B");
        d.add("X");
        d.addLast("Y");
        d.addFirst("X");
        d.addFirst("A"); //[A, X, B, A, X, Y]

        d.remove(); //[X, B, A, X, Y]
        d.removeLast(); //[X, B, A, X]
        d.removeLastOccurrence("X");//[X, B, A]
        d.remove("A"); //[X, B]

        System.out.println(d); 


    }

}
