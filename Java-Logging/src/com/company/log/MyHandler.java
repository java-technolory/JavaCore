package com.company.log;

import java.util.logging.LogRecord;
import java.util.logging.StreamHandler;

public class MyHandler extends StreamHandler {
    @Override
    public synchronized void publish(LogRecord logRecord) {
        super.publish(logRecord);
    }

    @Override
    public synchronized void flush() {
        super.flush();
    }

    @Override
    public synchronized void close() throws SecurityException {
        super.close();
    }
}
