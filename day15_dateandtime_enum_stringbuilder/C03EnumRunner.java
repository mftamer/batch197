package day15_dateandtime_enum_stringbuilder;

import java.util.Scanner;

public class C03EnumRunner {

    public static void main(String[] args) {

    //Enum is used to store constant values...

    String capital = UsStates.NEW_JERSEY.getCapital();
        System.out.println("capital = " + capital);



        //Example 1: Ask user to enter state name then give user capital city

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter State Name");
        String state = input.nextLine().toUpperCase();

        switch (state){
            case "ALABAMA":
                System.out.println(UsStates.ALABAMA.getCapital());
                break;
            case "ALASKA":
                System.out.println(UsStates.ALASKA.getCapital());
                break;
            case "AMERICAN SAMOA":
                System.out.println(UsStates.AMERICAN_SAMOA.getCapital());
                break;
            case "ARIZONA":
                System.out.println(UsStates.ARIZONA.getCapital());
                break;
            case "ARKANSAS":
                System.out.println(UsStates.ARKANSAS.getCapital());
                break;
            default:
                System.out.println("Invalid State Name");
        }


        UsStates [] states = UsStates.values();
        // System.out.println("Arrays.toString(states) = " + Arrays.toString(states));

        for (UsStates w: states){
            if (state.equals(w.toString())){
                System.out.println(w.getCapital());
                break;
            }
        }




    }




}
