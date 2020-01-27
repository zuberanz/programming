package hrank.problemSolving;

import java.time.LocalDate;
import java.util.Calendar;

public class java_date_and_time {

    /*

        The Calendar class is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week.

        You are given a date. You just need to write the method, , which returns the day on that date. To simplify your task, we have provided a portion of the code in the editor.

        For example, if you are given the date , the method should return  as the day on that date.

     */


    public static String findDay_calendar(int month, int day, int year) {

        Calendar cal = Calendar.getInstance();
        cal.set(year,month-1,day);
        int days = cal.get(Calendar.DAY_OF_WEEK);
        String daysofWeek[] = {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY",
                "FRIDAY","SATURDAY"};
        return daysofWeek[days-1];

    }

    public static String findDay_localDate(int month, int day, int year) {

        return LocalDate.of(year,month,day).getDayOfWeek().name();




    }

    public static void main(String[] args){

        System.out.println(findDay_calendar(8,5,2015));
        System.out.println(findDay_localDate(8,5,2015));


    }



}
