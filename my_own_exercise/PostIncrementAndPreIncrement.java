package my_own_exercise;

public class PostIncrementAndPreIncrement {

    public static void main(String[] args) {

        // When you ask Java to do two operations at a time, Java would like to know which one to do first

        int age = 20;
        int age2 = 20;

        System.out.println(age++); //20

        System.out.println(age);

        //age++;
        //System.out.println(age);


        System.out.println(++age2);

    }


}
