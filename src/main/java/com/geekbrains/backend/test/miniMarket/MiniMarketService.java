package com.geekbrains.backend.test.miniMarket;

import com.geekbrains.backend.test.miniMarket.model.*;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MiniMarketService {

    private final MiniMarketApi api;

    public MiniMarketService() {
        Retrofit retrofit = new Retrofit.Builder()
                // url приложения
                .baseUrl("http://minimarket1.herokuapp.com/market/api/v1/")
                //преобразование json в объекты
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        // retrofit создал клиента
        api = retrofit.create(MiniMarketApi.class);
    }

    public ProductResponse getProduct(Long id) throws IOException {
        Response<Product> response = api.getProduct(id).execute();
        ProductResponse productResponse = new ProductResponse();
        if(response.isSuccessful()){
            productResponse.setProduct(response.body());
            return productResponse;
        } else {
            productResponse.setError(response.errorBody().string());
            return productResponse;
        }
    }

//    public List<Category> getCategory(Long id) throws IOException {
//        Response<List<Category>> response = api.getCategory(id).execute();
//        CategoryResponse categoryResponse = new CategoryResponse();
//        if(response.isSuccessful()){
//            categoryResponse.setCategories(response.body());
//            return (List<Category>) categoryResponse;
//        } else {
//            categoryResponse.setError(response.errorBody().string());
//            return (List<Category>) categoryResponse;
//        }
//    }

    public List<Products> getProduct() throws IOException {
        Response<List<Products>> response = api.getProduct().execute();
        if(response.isSuccessful()){
            List<Products> productsList = response.body();
            productsList.forEach(products -> products.getProduct());
            return response.body();
        } else {
            throw new RuntimeException("404");
        }
    }

//    public ProductResponse createProduct(){
//        Response<Product> response = api.createProduct(new Product()
//                .setId(10L)
//                .setTitle("Choco-pai")
//                .setPrice(50));
//    }

    public ProductResponse deleteProduct(Long id) throws IOException {
        Response<Object> response = api.deleteProduct(id).execute();
        ProductResponse productResponse = new ProductResponse();
        if(response.isSuccessful()){
            return productResponse;
        } else {
            productResponse.setError(response.errorBody().string());
            return productResponse;
        }
    }

    public ProductResponse updateProduct(){
        Response<Object> response = api.updateProduct().execute();
        ProductResponse productResponse = new ProductResponse();
        if(response.isSuccessful()){
            productResponse.setProduct(response.body());
            return productResponse;
        } else {
            productResponse.setError(response.errorBody().string());
            return productResponse;
        }
    }
}
