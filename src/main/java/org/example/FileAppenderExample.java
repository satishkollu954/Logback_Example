package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class FileAppenderExample
{
    private static final Logger log=LoggerFactory.getLogger(FileAppenderExample.class);
    public static void main(String[] args)
    {
        log.info("Application started");
        try
        {
            int result=10/0;
        }
        catch(Exception e)
        {
            log.error("An error occurred",e);
        }
        log.info("Application ended");
    }
}