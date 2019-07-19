package mta.edu.vn.enums;

public class DayOfTheWeekConstants {
    public static final int MONDAY = 0;
    public static final int TUESDAY = 1;
    public static final int WEDNESDAY = 2;
    public static final int THURSDAY = 3;
    public static final int FRIDAY = 4;
    public static final int SATURDAY = 5;
    public static final int SUNDAY = 6;

    public boolean isWeekend(int day){
        return (day == SATURDAY  || day == SUNDAY);
    }
}
