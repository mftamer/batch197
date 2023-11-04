package day15_dateandtime_enum_stringbuilder;

import java.time.LocalDate;
import java.util.Scanner;

public class C02DateAndTime02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first year, than month and day");
        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();

        LocalDate birthDate = LocalDate.of(year,month,day);
        System.out.println("birthDate.getDayOfWeek() = " + birthDate.getDayOfWeek());

    }
}
