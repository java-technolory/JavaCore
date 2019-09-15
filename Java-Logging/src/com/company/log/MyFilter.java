package com.company.log;

import java.util.logging.Filter;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public class MyFilter implements Filter {
    @Override
    public boolean isLoggable(LogRecord logRecord) {
    /*
        if(logRecord.getLevel() == Level.CONFIG){
            return false;
        }
        return true;
    */
        return logRecord.getLevel() == Level.CONFIG ? false : true;
    }
}
