package mta.edu.vn.enums;

enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class Main {

    public static void main(String[] args) {

        Day day = Day.MONDAY;
        switch (day) {
            case SUNDAY:
                System.out.println("sunday");
                break;
            case MONDAY:
                System.out.println("monday");
                break;
            case TUESDAY:
                System.out.println("tuesday");
                break;
            case WEDNESDAY:
                System.out.println("wednesday");
                break;
            case THURSDAY:
                System.out.println("thursday");
                break;
            case FRIDAY:
                System.out.println("friday");
                break;
            case SATURDAY:
                System.out.println("saturday");
                break;
            default:
                System.out.println("other day");
        }

//        benefitOfEnumConstants();
        for (ThreadStates ts : ThreadStates.values()) {
            System.err.println(ts + " :: " + ts.hashCode() + " :: " + ts.ordinal() + " :: " + ThreadStates.valueOf("WAITING").ordinal());
        }

        System.err.println(ThreadStatesConstant.RUNNING);
    }

    /* This method shows the benefit of using Enum over Constants  */
    private static void benefitOfEnumConstants() {
        // Enum values are fixed
        simpleEnumExample(ThreadStates.START);
        simpleEnumExample(ThreadStates.WAITING);
        simpleEnumExample(ThreadStates.RUNNING);
        simpleEnumExample(ThreadStates.DEAD);
        simpleEnumExample(null);

        simpleConstantsExample(1);
        simpleConstantsExample(2);
        simpleConstantsExample(3);
        simpleConstantsExample(4);
        // we can pass any int constant
        simpleConstantsExample(5);
    }

    private static void simpleEnumExample(ThreadStates th) {
        if (th == ThreadStates.START) {
            System.out.println("Thread started.");
        } else if (th == ThreadStates.WAITING) {
            System.out.println("Thread is waiting.");
        } else if (th == ThreadStates.RUNNING) {
            System.out.println("Thread is running.");
        } else {
            System.out.println("Thread is dead.");
        }
    }

    private static void simpleConstantsExample(int i) {
        if (i == ThreadStatesConstant.START) {
            System.err.println("Thread is started.");
        } else if (i == ThreadStatesConstant.WAITING) {
            System.err.println("Thread is waiting.");
        } else if (i == ThreadStatesConstant.RUNNING) {
            System.err.println("Thread is running.");
        } else {
            System.err.println("Thread is dead.");
        }
    }
}
