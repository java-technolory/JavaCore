package mta.edu.vn.enums;

public enum DayOfTheWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public boolean isWeekend(DayOfTheWeek day) {
        return (day == SATURDAY || day == SUNDAY);
    }

    public <T extends Enum<T>> void performAction(final T instance){

    }

}
