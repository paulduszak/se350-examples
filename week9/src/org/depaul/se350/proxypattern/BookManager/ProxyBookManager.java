package org.depaul.se350.proxypattern.BookManager;

import org.depaul.se350.proxypattern.Book;

public class ProxyBookManager implements BookManager {

    private static BookManager realObject;

    @Override
    public boolean isAtEnd(Book book) {
        System.out.println("Invoking isAtEndMethod");

        if (realObject == null) {
            realObject = new RealBookManager();
        }

        return realObject.isAtEnd(book);
    }
}
