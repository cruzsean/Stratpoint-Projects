package com.SeanCruz;

import junit.framework.TestCase;
import com.SeanCruz.model.Product;

public class ProductTest extends TestCase {

    public void testProductConstructor(){
        Product product = new Product("1", "Laptop",10000);
        assertNotNull(product);
    }

    public void testProductGetters(){
        Product product = new Product("1", "Laptop",10000);
        assertEquals("1", product.getId());
        assertEquals("Laptop", product.getName());
    }

    public void testProductSetters(){
        Product product = new Product("1", "Laptop", 10000);
        product.setId("New ID");
        product.setName("New Name");
        product.setPrice(1012316231);
        assertEquals("New ID", product.getId());
        assertEquals("New Name", product.getName());
    }

}
