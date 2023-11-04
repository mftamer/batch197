package day14_varargs_passbyvalue_passbyreference;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class C03DateAndTime {

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
    }

}
