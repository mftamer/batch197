package day26_collections02;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class C01Sets {

    /*
        ***All collections use wrapper classes***
        1) Sets are used to store multiple "unique" data.
        2) Hash: Hashing is a technique to create unique data.
        3) Sets has three types:
            i) HashSet is used to store unique data
                HashSet stores elements in random order
                HashSet can accept a null element
                HashSet is super fast because they don't spend time to put them in order

            ii) LinkedHashSet is used to store unique data
                LinkedHashSet stores elements in insertion order

            iii) TreeSet is used to store unique data
                 TreeSet stores elements in "natural order"
                 Natural order is alphabetical for Strings, ascending order for Integer
                 TreeSet is so slow because putting element in order takes time

     */

    public static void main(String[] args) {
        System.out.println("Hi");
        long time1 = System.nanoTime();

        HashSet<String> email = new HashSet<>();
        email.add("ab@gmail.com");
        email.add("dc@gmail.com");
        email.add("xy@gmail.com");
        email.add("mn@gmail.com");
        email.add("kn@gmail.com");
        email.add("vy@gmail.com");
        email.add("ml@gmail.com");
        email.add("ab@gmail.com"); // Will not be seen in the console because it is unique. Ignores it
                                    //Ignores if you try to add an existing element
        email.add(null); //Do not put "" or "null". They are string value.
        email.add(null);
        email.add(null);
        email.add(null);

        System.out.println(email); //[ab@gmail.com, null, vy@gmail.com, ml@gmail.com, xy@gmail.com, dc@gmail.com,
                                    // mn@gmail.com, kn@gmail.com]

        long time2 = System.nanoTime();

        LinkedHashSet<String> ids = new LinkedHashSet<>();
        ids.add("ab@gmail.com");
        ids.add("dc@gmail.com");
        ids.add("xy@gmail.com");
        ids.add("mn@gmail.com");
        ids.add("kn@gmail.com");
        ids.add("vy@gmail.com");
        ids.add("ml@gmail.com");
        ids.add("ab@gmail.com"); // Will not be seen in the console because it is unique. Ignores it
                                    //Ignores if you try to add an existing element
        ids.add(null); //Do not put "" or "null". They are string value.
        ids.add(null);
        ids.add(null);
        ids.add(null);

        System.out.println(ids); //[ab@gmail.com, dc@gmail.com, xy@gmail.com, mn@gmail.com, kn@gmail.com, vy@gmail.com,
                                    // ml@gmail.com, null]

        long time3 = System.nanoTime();


        TreeSet<String> ssn = new TreeSet<>();
        ssn.add("ab@gmail.com");
        ssn.add("dc@gmail.com");
        ssn.add("xy@gmail.com");
        ssn.add("mn@gmail.com");
        ssn.add("kn@gmail.com");
        ssn.add("vy@gmail.com");
        ssn.add("ml@gmail.com");
        ssn.add("ab@gmail.com"); // Will not be seen in the console because it is unique. Ignores it
                                    //Ignores if you try to add an existing element
        //ssn.add(null); //Do not put "" or "null". They are string value. //NullPointerException, we can not add null
                            //to TreeSet
        ssn.add("kn@gmail.com");
        ssn.add("kn@gmail.com");
        ssn.add("kn@gmail.com");
        ssn.add("kn@gmail.com");
        System.out.println(ssn);

        long time4 = System.nanoTime();
        System.out.println("time1 = " + time1);
        System.out.println("time2 = " + time2);
        System.out.println("time3 = " + time3);
        System.out.println("time4 = " + time4);
        System.out.println("HashSet = " + (time2 - time1));
        System.out.println("LinkedHashSet = " + (time3 - time2));
        System.out.println("TreeSet = " + (time4 - time3));

        //Question1: Which Data structure do you use if you need to store unique elements in natural order?
        //Answer: TreeSet
        //Question2: But TreeSet is very slow. How do you prevent your code from being slow?
        //Answer: I will use speed of HashSet to create a Set and convert it to TreeSet.

        HashSet<String> email1 = new HashSet<>();
        email1.add("ab@gmail.com");
        email1.add("dc@gmail.com");
        email1.add("xy@gmail.com");
        email1.add("mn@gmail.com");
        email1.add("kn@gmail.com");
        email1.add("vy@gmail.com");
        email1.add("ml@gmail.com");
        email1.add("ab@gmail.com");
        email1.add("ab@gmail.com");
        email1.add("ab@gmail.com");
        email1.add("ab@gmail.com");


        TreeSet<String> stdId = new TreeSet<>(email1);
        long time5 = System.nanoTime();

        System.out.println("time1 = " + time1);
        System.out.println("time2 = " + time2);
        System.out.println("time3 = " + time3);
        System.out.println("time4 = " + time4);
        System.out.println("time5 = " + time5);
        System.out.println("HashSet = " + (time2 - time1));
        System.out.println("LinkedHashSet = " + (time3 - time2));
        System.out.println("TreeSet = " + (time4 - time3));
        System.out.println("HashSet + TreeSet = " + (time5 - time4));

    }

}
