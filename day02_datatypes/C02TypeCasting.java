package day02_datatypes;

public class C02TypeCasting {

    public static void main(String[] args) {
        //Type Casting is changing a primitive data type of variable to another data type
        byte age = 35;
        byte myAge = age;

        //If we change a data type of variable into a larger data type. It is called "Auto widening" in Java
        short yourAge = age;
        System.out.println("yourAge = " + yourAge); //yourAge = 35

        /* Explicit narrowing: Casting a large data type into smaller data type
                               Java doesn't do it in its own, so we have to do it explicitly
                               by adding the name of a smaller data type before the variable which has larger data
         */
        short height = 127;
        byte heightOfBuilding = (byte) height;
        System.out.println(heightOfBuilding); //127

        //double has decimals, run and check it
        double height2 = height;
        System.out.println("height2 = " + height2); //height2 = 127.0

        //Doesn't care after the decimal point 79.95 ==> 79. Java doesn't round in this case
        double weight = 79.95;
        short weight1 = (short) weight;
        System.out.println("weight1 = " + weight1); //weight1 = 79

        // NOTE: When doing mathematical operations in java, if data types are same, results must have the same data type with the variables.
        // The result may not fit to the given data type; in this case, java will remove decimal parts.

        int numOfStd = 20;
        int amountOfMoney = 398;
        System.out.println(amountOfMoney/numOfStd); //19

        //When doing math operations and if the data types are different, the result will be in the same data with the larger one.
        int numberOfStudents = 20;
        float moneyAmount = 398.0F;
        System.out.println(moneyAmount/numberOfStudents); //19.9


        /* this is my code
        double numOfStd =20;
        double amountOfMoney = 398;
        double amountPerStd;
        amountPerStd = amountOfMoney / numOfStd;
        System.out.println("amountPerStd = " + amountPerStd);
*/
    }

}
