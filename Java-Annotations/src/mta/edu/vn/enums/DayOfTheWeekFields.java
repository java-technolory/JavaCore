package mta.edu.vn.enums;

public enum  DayOfTheWeekFields {
    MONDAY(false),
    TUESDAY(false),
    WEDNESDAY(false),
    THURSDAY(false),
    FRIDAY(false),
    SATURDAY(false),
    SUNDAY(false);

    private final boolean isWeekend;

    private DayOfTheWeekFields(final boolean isWeekend){
        this.isWeekend = isWeekend;
    }

    public boolean isWeekend(){
        return this.isWeekend;
    }

}

