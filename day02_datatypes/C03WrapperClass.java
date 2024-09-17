package day02_datatypes;

public class C03WrapperClass {

    public static void main(String[] args) {
        /*Wrapper class; Java created a new data structure by adding some useful methods to primitive data types.
                         This new structure is called "wrapper class"
                         Java created wrapper class for every primitive data.

                         Primitive                      Wrapper Class
                            byte            ====>            Byte
                            short           ====>            Short
                            int             ====>            Integer
                            long            ====>            Long
                            float           ====>            Float
                            double          ====>            Double
                            boolean         ====>            Boolean
                            char            ====>            Character

                   Primitive data does not have methods

    */
        int weigth = 25;

        // Wrapper class has useful methods
        Integer height = 120;


        // We can find the maximum or minimum of int by using Wrapper Class methods.
        System.out.println(Integer.MAX_VALUE); //2147483647
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE); //Integer.MIN_VALUE = -2147483648

        // We can find the maximum or minimum of the short data type by using Wrapper Class methods.
        System.out.println("Short.MAX_VALUE = " + Short.MAX_VALUE);
        System.out.println("Short.MIN_VALUE = " + Short.MIN_VALUE);

        // We can find the maximum or minimum of the long data type by using Wrapper Class methods.
        System.out.println("Long.MAX_VALUE = " + Long.MAX_VALUE);
        System.out.println("Long.MIN_VALUE = " + Long.MIN_VALUE);

        // Auto Boxing: Converting primitive data to Wrapper Class (Java does this by itself - Automatically)
        char chr = '?';
        Character chr2 = chr;

        // Unboxing: Converting Wrapper Class data to primitive data. (Java does this by itself - Automatically)
        Boolean b1 = true;
        //String str = b1.toString(); // "true"
        //System.out.println(b1.equals(true)); this is just an example
        boolean b2 = b1;

        //===================EXAMPLES================
        Double num=43.5; //change a data type to short data by Wrapper class methods
        short fromDouble = num.shortValue(); //keep it in a short box
        System.out.println("num = " + num);
        System.out.println("fromDouble = " + fromDouble);

        String strFromDouble = num.toString(); // store in a string container - value will be 43.5
        System.out.println("strFromDouble = " + strFromDouble);

        // Divide
        System.out.println(num/5);
        //System.out.println(strFromDouble/5); //String cannot do mathematical operations.

        //Last example
        String str1 = "99.5"; // convert it to double type data
        Double.valueOf(str1); //99.5
        double fromString = Double.valueOf(str1);
        System.out.println("str1 = " + str1); // string changed to double

        //Homework
        String str2 = "99";
        int number = Integer.valueOf(str2);
        System.out.println("str2 as int = " + number);
    }



}
