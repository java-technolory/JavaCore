package mta.edu.vn.enums;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

public class EnumSetExample {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        final Set<DayOfTheWeek> enumSetAll = EnumSet.allOf(DayOfTheWeek.class);
        final Set<DayOfTheWeek> enumSetNone = EnumSet.noneOf(DayOfTheWeek.class);
        final Set<DayOfTheWeek> enumSetOf = EnumSet.of(DayOfTheWeek.SUNDAY, DayOfTheWeek.MONDAY, DayOfTheWeek.SATURDAY);
        Iterator<DayOfTheWeek> itr = enumSetOf.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next().name());
        }

    }
}
