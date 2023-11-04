package day15_dateandtime_enum_stringbuilder;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class C01DateAndTime01 {

    public static void main(String[] args) {

        // How to get local date:
        LocalDate myDate = LocalDate.now(); /*Obtains the current date from the system clock in the default time-zone.
                                            This will query the system clock in the default time-zone to obtain the current date.
                                            Using this method will prevent the ability to use an alternate clock for testing because the clock is hard-coded.
                                            Returns:
                                            the current date using the system clock and default time-zone, not null
                                            */
        System.out.println("myDate = " + myDate); //myDate = 2023-10-15

        //How to go to a future date
        LocalDate futureDate = myDate.
                plusDays(3).
                plusMonths(2).
                plusYears(3); //method chain
        System.out.println("futureDate = " + futureDate);

        //How to go to past date
        LocalDate pastDate = myDate.
                minusMonths(5).
                minusYears(2).
                minusDays(2);
        System.out.println("pastDate = " + pastDate);

        //How to format a date
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy"); //MM stands for months, mm is for minutes
        String currentDate = dtf.format(myDate);
        System.out.println("currentDate = " + currentDate);


        DateTimeFormatter dt = DateTimeFormatter.ofPattern("MMM/dd/yyyy"); // currentDate1 = Oct./15/2023
        String currentDate1 = dt.format(myDate);
        System.out.println("currentDate1 = " + currentDate1);

        DateTimeFormatter dt2 = DateTimeFormatter.ofPattern("MMMM/dd/yyyy"); //currentDate12 = October/15/2023
        String currentDate12 = dt.format(myDate);
        System.out.println("currentDate12 = " + currentDate12);

        //How to find date in another place:
        LocalDate dateInJapan = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("dateInJapan = " + dateInJapan);

        //How to get Local time:
        LocalTime currentTime = LocalTime.now();
        System.out.println("currentTime = " + currentTime);

        //How to go future and past:
        LocalTime anotherTime = currentTime.
                plusHours(2).
                plusMinutes(20).
                minusSeconds(30);
        System.out.println("anotherTime = " + anotherTime);

        //How to format time:
        //DateTimeFormatter f1 = DateTimeFormatter.ofPattern("HH:mm"); //strTime = 10:25
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("hh:mm");
        String strTime = f1.format(currentTime);
        System.out.println("strTime = " + strTime);

        //Local time in Toronto:
        LocalTime timeInToronto = LocalTime.now(ZoneId.of("America/Toronto"));
        System.out.println("timeInToronto = " + timeInToronto);

        //How to set certain time
        //15:30
        LocalTime time = LocalTime.of(15,30);
        System.out.println("time = " + time);

        //How to get both date and time:
        LocalDateTime dateAndTime = LocalDateTime.now();
        System.out.println("dateAndTime = " + dateAndTime); //dateAndTime = 2023-10-17T10:39:47.845550200
        System.out.println("dateAndTime.getDayOfYear() = " + dateAndTime.getDayOfYear()); //290
        System.out.println("dateAndTime.getDayOfMonth() = " + dateAndTime.getDayOfMonth()); //17
        System.out.println("dateAndTime.getDayOfWeek() = " + dateAndTime.getDayOfWeek()); //Tuesday

        System.out.println("dateAndTime.getMonthValue() = " + dateAndTime.getMonthValue()); //10
        Month month1 = dateAndTime.getMonth(); // Data type is month you can see it while writing getMonth()
        System.out.println("month1 = " + month1); //OCTOBER
        System.out.println("dateAndTime.getMonth() = " + dateAndTime.getMonth()); //OCTOBER


        //Example 4: If the given date is before the current date give message to user like "Invalid date"
        //           If the given date equals the current date give message to user like "Give the time"
        //           If the time is before current time tell to user "No ticket" otherwise tell to user "There is just 1 ticket"
        //           If the given date is after the current date give message to user like "Buy the ticket"

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the Date:"); //12.10.2023
        System.out.println("Enter year:");
        int year = input.nextInt();
        System.out.println("Enter month:");
        int month = input.nextInt();
        System.out.println("Enter day:");
        int day = input.nextInt();

        LocalDate givenDate = LocalDate.of(year, month,day);

        if (givenDate.isBefore(myDate)){
            System.out.println("Invalid Date!");

        } else if (givenDate.isEqual(myDate)) {
            System.out.println("Enter the hour:");
            int hour = input.nextInt();
            System.out.println("Enter the minutes:");
            int minutes = input.nextInt();

            LocalTime givenTime = LocalTime.of(hour, minutes);
            if (givenTime.isAfter(currentTime)){
                System.out.println("There is just 1 ticket left.");
            }else {
                System.out.println("No ticket left.");
            }
        } else if (givenDate.isAfter(myDate)) {
            System.out.println("You can buy ticket!");
        }


    }

}
