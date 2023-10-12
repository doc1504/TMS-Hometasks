package org.example.iterator;

import java.util.Iterator;

public class ProductCatalog implements Iterable{

    public String productCatalog[] = {"Toothbrush", "Toothpaste", "Soap", "Shampoo"};


    @Override
    public Iterator getIterator() {
        return new ProductIterator();
    }

    private class ProductIterator implements Iterator {
        int index;
        @Override
        public boolean hasNext() {
            if (index < productCatalog.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {

            if (this.hasNext()){
                return productCatalog[index++];
            }
            return null;
        }
    }
}
