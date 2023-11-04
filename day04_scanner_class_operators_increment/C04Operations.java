package day04_scanner_class_operators_increment;

public class C04Operations {

    public static void main(String[] args) {

        /*
         "=" Assignment operator: assigns value on the right to the value on the left
         "==" Equality Operator: Compares right-hand side with the left-hand side.
            Example; 3+5 == 8 -----> true    3 + 2 == 2 -----> false /Java will think as if we are asking question
                     'A' == 65 ---->  */
        System.out.println('A'==65); //If we use chars together with mathematical operations, Java uses their ASCII value
        System.out.println("A"+"a");
        System.out.println('A'+'a');
        System.out.println("A"+'a');

        // Example; Find ASCII value of '!' by typing code

        System.out.println('!' + 0 ); //make it a mathematical operation, so it gives the ASCII Value
        // OR
        System.out.println('!' * 1);

        /* '!' Not operator: !true = not true aka false
                             !false = true
                             !!true = true
            '!=' Not Equal : 3+4 !=1 ----> true
                             2+5 !=7 ----> false
            '>' , '<' , '>=' , '<=',
            **** ALL OF THESE OPERATIONS RETURN BOOLEAN (TRUE OR FALSE)
         -------------00000-----------000000---------------000000-------------00000
            '==' with Strings
            For every String data there are two main parts: 1) Value
                                                            2) Address (Reference)
         */

        String s1 = "Tom";   //Tom is created in Heap but its reference is in stack
        String s2 = "Hanks"; //Same as Tom
                             //In heap, it is Tom, but in stack it is s1.
        System.out.println(s1==s2);
        String s3 = "Tom";
        System.out.println(s1==s3); //Since they are both Tom, Java will not create new memory or reference.
        String s4 = new String("Tom");
        System.out.println(s1==s4);

        /*
        When we compare String values don't prefer to use '==' operator.
        To compare two Strings, use String methods. (equals())
         */
        s1.equals(s4);
        System.out.println(s1.equals(s4));
        s1.equalsIgnoreCase(s4); //Just to check 'T', 'O', 'M' without changing capital or lower letter
        System.out.println(s1.equalsIgnoreCase(s4));
    }
}
