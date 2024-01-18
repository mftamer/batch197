package day27_maps;

import java.util.*;

public class C01Maps01 {
    /*
        Maps are store in curly braces {} Collection is stored in []
        key and value (definition of what the key is)
         There are unique 'Keys' and Not Unique 'Values'.
         You can say:  one null, but multiple null value.

    (Unique)         (Not Unique)

     Key(K)   -------->   Value(V)


    {[Cat               Pet] = Each pair is called 'Entry'. Each 'Entry' is 'Unique'.
      Dog               Pet
      Lion              Wild
      A                 23
      B                 15
      C                 14}  = Whole list is called 'Entry Set'. 'Entry Set''s can use loops.


         */
    public static void main(String[] args) {

        //String is key and Integer is value. The First element is key and the second element is value.
        HashMap<String,Integer> stdAges = new HashMap<>();
        stdAges.put("Tom",53);
        stdAges.put("Angelina",57);
        stdAges.put("Linda",23);
        stdAges.put("Leo",51);
        stdAges.put("Brad",39);
        stdAges.put("Linda",12); //If same key is used the value will be overridden.

        System.out.println(stdAges); //{Tom=53, Angelina=57, Leo=51, Brad=39, Linda=12}

        // How to work with keys only:
        // Example 1: Get the total number of characters in student names:

        Set<String> keys = stdAges.keySet();
        System.out.println(keys); //[Tom, Angelina, Leo, Brad, Linda]
        int numOfChars=0;

        for (String w:keys){
            numOfChars = numOfChars+w.length();
        }
        System.out.println("numOfChars = " + numOfChars); //numOfChars = 23

        //How to work with values:
        // Example 2: Find the average age of the students

        Collection<Integer> values = stdAges.values();
        System.out.println(values); //[53, 57, 51, 39, 12]
           int sum=0;
        for (Integer w:values){

              sum=sum+w;

        }
        System.out.println("sum = " + sum); //sum = 212
        double average = (double) sum / values.size(); //casting
        System.out.println("average = " + average); //average = 42.4

        //How to loop with Entries:
        //Example 3: Find the sum the number of characters and the age for each loop individual entries:
        //for (Map<String, Integer> w :stdAges); //Foreach not applicable to type
                                                // 'java.util.HashMap<java.lang.String,java.lang.Integer>'
        Set<Map.Entry<String,Integer>> entries = stdAges.entrySet();
        System.out.println(entries); //[Tom=53, Angelina=57, Leo=51, Brad=39, Linda=12]

        for (Map.Entry<String,Integer> w:entries) {
            int total = w.getKey().length() + w.getValue();
            System.out.println("For " + w.getKey() + ": " + total); //For Tom: 56
                                                                    //For Angelina: 65
                                                                    //For Leo: 54
                                                                    //For Brad: 43
                                                                    //For Linda: 17
        }

        // Common methods used with maps

            int age = stdAges.get("Linda");
            System.out.println("age = " + age); //age = 12

            stdAges.putIfAbsent("Tom",35); //{Tom=53, Angelina=57, Leo=51, Brad=39, Linda=12}
            stdAges.putIfAbsent("Tommy",35);
            System.out.println(stdAges); //{Tom=53, Angelina=57, Leo=51, Brad=39, Tommy=35, Linda=12}

            stdAges.replace("Leo",55); //When you want to update a value of an entry use replace() not put()
            stdAges.replace("Brad",23,45); // this won't work because brad is not 23
            stdAges.replace("Brad",39,45);
            System.out.println(stdAges); //{Tom=53, Angelina=57, Leo=55, Brad=45, Tommy=35, Linda=12}

            stdAges.put("Leo",55); //When you want to update a value of an entry use replace() not put()
            System.out.println(stdAges); //{Tom=53, Angelina=57, Leo=55, Brad=45, Tommy=35, Linda=12}

            System.out.println("stdAges.containsKey(\"Leon\") = " + stdAges.containsKey("Leon"));
                                                                                //stdAges.containsKey("Leon") = false

            System.out.println("stdAges.containsKey(\"Leon\") = " + stdAges.containsKey("Leo"));
                                                                                //stdAges.containsKey("Leon") = true

            System.out.println("stdAges.containsValue(45) = " + stdAges.containsValue(45));
                                                                                    //stdAges.containsValue(45) = true
            boolean r1 = stdAges.containsValue(45);
            System.out.println("r1 = " + r1); //r1 = true

            System.out.println(stdAges.getOrDefault("Linda", 0)); //12

            System.out.println(stdAges.getOrDefault("linda", 0)); //0

            System.out.println(stdAges.getOrDefault("inda", 100)); //100

            stdAges.remove("Leo");
            System.out.println(stdAges); //{Tom=53, Angelina=57, Brad=45, Tommy=35, Linda=12}

            stdAges.remove("Brad", 44); //Because Brad is 45
            System.out.println(stdAges);//{Tom=53, Angelina=57, Brad=45, Tommy=35, Linda=12}

            stdAges.remove("Brad", 45);
            System.out.println(stdAges); //{Tom=53, Angelina=57, Tommy=35, Linda=12}

            stdAges.put("Bra",44);
            System.out.println(stdAges); //{Bra=44, Tom=53, Angelina=57, Tommy=35, Linda=12}
    }

}
