package com.geekbrains.backend.test.miniMarket.model;

public class Products {

    private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Products{" +
                "product='" + product + '\'' +
                '}';
    }
}
