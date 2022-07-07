package com.ekaqa.automation.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Logging {

    private static final Logger logger
            = LoggerFactory.getLogger(Logging.class);

    public static void loggerInfo(String Value){
        logger.info(Value);
    }
}
