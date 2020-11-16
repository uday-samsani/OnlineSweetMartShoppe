package com.cg.osm.servicetest;

import com.cg.osm.entites.Category;
import com.cg.osm.entites.Product;
import com.cg.osm.service.ProductService;
import com.cg.osm.service.ProductServiceImpl;
import org.junit.jupiter.api.Test;

public class ProductServiceTest {
    @Test
    public void testAddProduct(){
        Category sweets = new Category(1,"sweets");
        ProductService service= new ProductServiceImpl();
        Product a = new Product(1, "Jalebi","/","lprem ipsum",45.0,true,sweets);
        service.addProduct(a);
        System.out.println("tested");
    }
}
