package org.depaul.se350.exceptionexample.truck.exception;

public class AlreadyLoadedException extends Exception
{
    public AlreadyLoadedException(String msg)
    {
        super(msg);
    }
}
