package mta.edu.vn.test;

import mta.edu.vn.enums.DayOfTheWeek;
import mta.edu.vn.enums.DayOfTheWeekFieldInterfaces;

public class Main {
    public static void main(String [] args){
        System.out.println(DayOfTheWeekFieldInterfaces.SUNDAY.getWeekend());
        System.out.println(DayOfTheWeekFieldInterfaces.valueOf("SUNDAY").ordinal());
        System.out.println(DayOfTheWeekFieldInterfaces.valueOf(DayOfTheWeek.class,""));
    }
}
