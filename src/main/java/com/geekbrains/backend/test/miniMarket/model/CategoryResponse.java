package com.geekbrains.backend.test.miniMarket.model;

import java.util.List;

public class CategoryResponse {
    private List<Category> categories;
    private String error;

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "CategoryResponse{" +
                "categories=" + categories +
                ", error='" + error + '\'' +
                '}';
    }
}
