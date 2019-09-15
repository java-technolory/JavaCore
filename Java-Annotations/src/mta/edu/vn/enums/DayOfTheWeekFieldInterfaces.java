package mta.edu.vn.enums;

public enum DayOfTheWeekFieldInterfaces implements DayOfWeek {
    MONDAY("A"),
    TUESDAY("B"),
    WEDNESDAY("C"),
    FRIDAY("D"),
    SATURDAY("E"),
    SUNDAY("F");

    private final String is;

    // default or private (not public and protected)
    private DayOfTheWeekFieldInterfaces(final String is){
        this.is = is;
    }

    @Override
    public boolean isWeekend() {
        return false;
    }

    @Override
    public String getWeekend() {
        return this.is;
    }
}
