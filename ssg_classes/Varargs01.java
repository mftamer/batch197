package ssg_classes;

public class Varargs01 {

    //Example 1: Sum of Numbers
    public int sum(int... numbers){
        int total = 0;
        for (int num: numbers){
            total = total+num;
        }
        return total;
    }

    //Example 2: Concatenating of Strings
    public static String conca(String... strings){
        StringBuilder sb = new StringBuilder();
        for (String str : strings){
            sb.append(str);
        }
        return sb.toString();
    }


    //Example 3: Finding the Maximum Number
    public int findMax( int... number){
        int max = 0;
        for (int w : number){
            if (w > max){
                max = w;
            }
        }
        return max;
    }


    public static void main(String[] args) {
        Varargs01 varargs01 = new Varargs01();

        System.out.println(varargs01.sum(52, 31, 88, 91, 105));//367

        System.out.println(conca("Hello ", " ", "World"," ", "This is ", "Mr. Emery"));

        System.out.println(varargs01.findMax(-10, -5, -20));


    }


}
