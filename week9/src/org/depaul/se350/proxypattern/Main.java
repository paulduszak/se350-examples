package org.depaul.se350.proxypattern;

import org.depaul.se350.proxypattern.BookManager.BookManager;
import org.depaul.se350.proxypattern.BookManager.ProxyBookManager;
import org.depaul.se350.proxypattern.exception.BadParameterException;
import org.depaul.se350.proxypattern.exception.NullParameterException;

public class Main {
    public static void main(String[] args) throws BadParameterException, NullParameterException
    {
//        // Instantiating an instance of the Book class
        Book book = new Book("How to teach OOP", "Paul Duszak", 2022, 800);

        BookManager bookManager = new ProxyBookManager();

        // Contrived example
        // When applying proxy to createFlight, you don't need to pass in a Flight instance,
        // you simply continue to pass the fields required to create a Flight.
        // Similarly, when applying proxy to getFlightById, you're not going to pass an instance of
        // Flight. You'd just keep the parameters that you currently have.
        bookManager.isAtEnd(book);

    }
}
