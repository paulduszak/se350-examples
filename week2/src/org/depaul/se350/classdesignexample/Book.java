package org.depaul.se350.classdesignexample;

import org.depaul.se350.classdesignexample.exception.BadParameterException;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private int numberOfPages;
    private int currentPageNumber;

    public Book(String title, String author, int publicationYear, int numberOfPages) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.numberOfPages = numberOfPages;
    }

    public void setCurrentPageNumber(int currentPageNumber) throws BadParameterException {
        if (currentPageNumber > this.getNumberOfPages() || currentPageNumber < 0) {
            throw new BadParameterException("Passed page number exceeds number of pages.");

            //currentPageNumber = 0;
            //System.out.println("Bad page number!");
        }

        currentPageNumber = currentPageNumber;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() { return publicationYear; }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getCurrentPageNumber() {
        return currentPageNumber;
    }

    public boolean isAtEnd() {
        if (currentPageNumber == numberOfPages) return true;
        else return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-20s %s%n", "Title:", title));
        sb.append(String.format("%-20s %s%n", "Author:", author));
        sb.append(String.format("%-20s %d%n", "Publication Year:", publicationYear));
        sb.append(String.format("%-20s %d%n", "Number of Pages:", numberOfPages));
        sb.append(String.format("%-20s %d%n", "Current Page:", currentPageNumber));
        sb.append(String.format("%-20s %b%n", "Is At End:", isAtEnd()));
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear && numberOfPages == book.numberOfPages && title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publicationYear, numberOfPages);
    }
}
