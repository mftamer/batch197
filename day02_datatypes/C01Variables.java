package day02_datatypes;

public class C01Variables {

    public static void main(String[] args) {
        byte stdAge = 35; //byte is the shortest; therefore, it has less memory
        System.out.println(stdAge);

        //3245
        short numOfStdInSchool = 3245; //second largest
        System.out.println(numOfStdInSchool);

        //1200000
        int populationOfMiami = 1200000; // third largest
        System.out.println(populationOfMiami);

        //If a long variable is out of integer range limits, add "L" to the end
        long popOfWorld = 7000000000L;
        System.out.println(popOfWorld);

        //If a long variable is in the integer range limits, don't add "L" to the end
        long popOfChina = 1500000000;
        System.out.println(popOfChina);

        float shirtPrice = 23.34F;
        System.out.println(shirtPrice);

        double weightOfCell = 0.000000012;
        System.out.println("weightOfCell = " + weightOfCell);

        boolean isRetired= false;
        System.out.println("isRetired = " + isRetired);

        char initial = 'H';
        System.out.println("initial = " + initial);

        String name = "Mark Twain";
        System.out.println("name = " + name);
    }
  /*  public static void main(String[] args){
        just type main and press enter for upper expression - this is short-cut
    }
    */
}
