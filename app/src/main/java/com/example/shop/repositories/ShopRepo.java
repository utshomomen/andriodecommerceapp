package com.example.shop.repositories;

import android.net.http.SslCertificate;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.shop.models.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.xml.namespace.QName;

public class ShopRepo {


    private MutableLiveData<List<Product>> mutableProductList;

    public LiveData<List<Product>> getProduct(){

        if(mutableProductList == null){
            mutableProductList = new MutableLiveData<>();
            loadProducts();
        }

        return  mutableProductList;
    }
    private  void loadProducts (){


        List<Product> productList = new ArrayList<>();
        productList.add(new Product(UUID.randomUUID().toString(), "iphone", 122, true, "./models/com.example.shop/res/drawable/iphone.jpg"));

        productList.add(new Product(UUID.randomUUID().toString(), "iphone", 122, true, "./models/com.example.shop/res/drawable/iphone.jpg"));

        productList.add(new Product(UUID.randomUUID().toString(), "iphone", 122, true, "./models/com.example.shop/res/drawable/iphone.jpg"));

        productList.add(new Product(UUID.randomUUID().toString(), "iphone", 122, true, "./models/com.example.shop/res/drawable/iphone.jpg"));


        productList.add(new Product(UUID.randomUUID().toString(), "iphone", 122, true, "./models/com.example.shop/res/drawable/iphone.jpg"));

        productList.add(new Product(UUID.randomUUID().toString(), "iphone", 122, true, "./models/com.example.shop/res/drawable/iphone.jpg"));

        productList.add(new Product(UUID.randomUUID().toString(), "iphone", 122, true, "./models/com.example.shop/res/drawable/iphone.jpg"));

        productList.add(new Product(UUID.randomUUID().toString(), "iphone", 122, true, "./models/com.example.shop/res/drawable/iphone.jpg"));



        productList.add(new Product(UUID.randomUUID().toString(), "iphone", 122, true, "./models/com.example.shop/res/drawable/iphone.jpg"));

        productList.add(new Product(UUID.randomUUID().toString(), "iphone", 122, true, "./models/com.example.shop/res/drawable/iphone.jpg"));

        productList.add(new Product(UUID.randomUUID().toString(), "iphone", 122, true, "./models/com.example.shop/res/drawable/iphone.jpg"));

        productList.add(new Product(UUID.randomUUID().toString(), "iphone", 122, true, "./models/com.example.shop/res/drawable/iphone.jpg"));


        productList.add(new Product(UUID.randomUUID().toString(), "iphone", 122, true, "./models/com.example.shop/res/drawable/iphone.jpg"));

        productList.add(new Product(UUID.randomUUID().toString(), "iphone", 122, true, "./models/com.example.shop/res/drawable/iphone.jpg"));

        productList.add(new Product(UUID.randomUUID().toString(), "iphone", 122, true, "./models/com.example.shop/res/drawable/iphone.jpg"));

        productList.add(new Product(UUID.randomUUID().toString(), "iphone", 122, true, "./models/com.example.shop/res/drawable/iphone.jpg"));


        productList.add(new Product(UUID.randomUUID().toString(), "iphone", 122, true, "./models/com.example.shop/res/drawable/iphone.jpg"));

        productList.add(new Product(UUID.randomUUID().toString(), "iphone", 122, true, "./models/com.example.shop/res/drawable/iphone.jpg"));

        productList.add(new Product(UUID.randomUUID().toString(), "iphone", 122, true, "./models/com.example.shop/res/drawable/iphone.jpg"));

        productList.add(new Product(UUID.randomUUID().toString(), "iphone", 122, true, "./models/com.example.shop/res/drawable/iphone.jpg"));


        productList.add(new Product(UUID.randomUUID().toString(), "iphone", 122, true, "./models/com.example.shop/res/drawable/iphone.jpg"));

        productList.add(new Product(UUID.randomUUID().toString(), "iphone", 122, true, "./models/com.example.shop/res/drawable/iphone.jpg"));

        productList.add(new Product(UUID.randomUUID().toString(), "iphone", 122, true, "./models/com.example.shop/res/drawable/iphone.jpg"));

        productList.add(new Product(UUID.randomUUID().toString(), "iphone", 122, true, "./models/com.example.shop/res/drawable/iphone.jpg"));


        mutableProductList.setValue(productList);
    }

}
