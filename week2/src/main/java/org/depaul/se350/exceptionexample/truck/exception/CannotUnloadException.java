package org.depaul.se350.exceptionexample.truck.exception;

public class CannotUnloadException extends Exception
{
    public CannotUnloadException(String msg)
    {
        super(msg);
    }
}
