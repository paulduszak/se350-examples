package org.depaul.se350.proxypattern.BookManager;

import org.depaul.se350.proxypattern.Book;

public class RealBookManager implements BookManager {

    @Override
    public boolean isAtEnd(Book book) {
        return book.isAtEnd();
    }
}
