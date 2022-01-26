package org.depaul.se350.classdesignexample;

import org.depaul.se350.classdesignexample.Product;
import org.depaul.se350.classdesignexample.exception.BadParameterException;
import org.depaul.se350.classdesignexample.exception.NullParameterException;

public class Main {
    public static void main(String[] args) throws BadParameterException, NullParameterException
    {
//        // Instantiating an instance of the Book class
//         Book book = new Book("My Book", "Paul Duszak", 2022, 800);
//         Book book2 = new Book("My Book", "Paul Duszak", 2022, 800);
//
//
//        // Book equality check
//        System.out.println(String.format("Are the two books equal: %s", book.equals(book2)));
//        // Invoking the Book class toString method
//     //   System.out.println(book);


//        Product product = null;
//
//        try {
//            product = new Product(null, 20.00, null);
//        } catch (NullParameterException e) {
//            System.out.println("Hit null param exception");
//            e.printStackTrace();
//        } catch (BadParameterException e) {
//            e.printStackTrace();
//        }

        //System.out.println(product);

        Product product2 = new Product("Product A", 20.00, Product.ProductType.GENERAL);
        Product product3 = new Product("Product A", 20.00, Product.ProductType.GENERAL);

        System.out.println(product2);
        System.out.println(String.format("Are the two products equal: %s", product2.equals(product3)));
    }
}
