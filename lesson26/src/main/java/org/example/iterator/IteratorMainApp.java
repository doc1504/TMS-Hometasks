package org.example.iterator;

import java.util.Iterator;

public class IteratorMainApp {
    public static void main(String[] args) {
        ProductCatalog productCatalog = new ProductCatalog();
        Iterator iterator = productCatalog.getIterator();

        while (iterator.hasNext()) {
            System.out.println("Product name : " + iterator.next());
        }
    }
}
