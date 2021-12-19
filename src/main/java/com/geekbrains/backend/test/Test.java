package com.geekbrains.backend.test;

import com.geekbrains.backend.test.miniMarket.MiniMarketService;
import com.geekbrains.backend.test.miniMarket.model.Category;
import com.geekbrains.backend.test.miniMarket.model.Product;
import com.geekbrains.backend.test.miniMarket.model.ProductResponse;
import com.geekbrains.backend.test.miniMarket.model.Products;

import java.io.IOException;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {

        MiniMarketService service = new MiniMarketService();
        ProductResponse product = service.getProduct(100L);
        System.out.println(product);

//        List<Category> categories = service.getCategory(1L);
//        System.out.println(categories);

        List<Products> productsList = service.getProduct();
        System.out.println(productsList);

        ProductResponse productResponse = service.deleteProduct(100L);
        System.out.println(productResponse);
    }
}
