package com.company.log;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.*;

public class LoggingExample {

    static Logger logger = Logger.getLogger(LoggingExample.class.getName());

    public static void main(String[] args) throws IOException {
//        LogManager.getLogManager().readConfiguration(new FileInputStream("mylogging.properties"));
        logger.setLevel(Level.FINE);
        logger.addHandler(new ConsoleHandler());

        //adding customer handler
        logger.addHandler(new MyHandler());

        //FileHander file name with max size and number of log file limit
        Handler fileHandler = new FileHandler("/tmp/logger.log", 20000, 10);
//        fileHandler.setFormatter(new MyFormatter());

        //setting custom filter for FileHandler
        fileHandler.setFilter(new MyFilter());
        logger.addHandler(fileHandler);

        for (int i = 0; i < 1000; i++) {
            //logging message
            logger.log(Level.INFO, "Msg" + i);
        }

        logger.log(Level.CONFIG,"Config Data");

    }
}
