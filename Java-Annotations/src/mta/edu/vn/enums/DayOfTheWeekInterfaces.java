package mta.edu.vn.enums;

interface DayOfWeek {
    boolean isWeekend();

    default String getWeekend() {
        return null;
    }
}

public enum DayOfTheWeekInterfaces implements DayOfWeek {
    MONDAY() {
        @Override
        public boolean isWeekend() {
            return false;
        }
    },
    TUESDAY() {
        @Override
        public boolean isWeekend() {
            return false;
        }
    },
    WEDNESDAY() {
        @Override
        public boolean isWeekend() {
            return false;
        }
    },
    THURSDAY() {
        @Override
        public boolean isWeekend() {
            return false;
        }
    },
    FRIDAY() {
        @Override
        public boolean isWeekend() {
            return false;
        }
    },
    SATURDAY() {
        @Override
        public boolean isWeekend() {
            return false;
        }
    },
    SUNDAY() {
        @Override
        public boolean isWeekend() {
            return false;
        }
    };

}
