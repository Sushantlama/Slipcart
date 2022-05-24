package com.example.slipkart.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.os.Bundle;

import com.example.slipkart.R;
import com.example.slipkart.adapters.CategoryAdapter;
import com.example.slipkart.adapters.ProductAdapter;
import com.example.slipkart.databinding.ActivityMainBinding;
import com.example.slipkart.model.Category;
import com.example.slipkart.model.Product;

import org.imaginativeworld.whynotimagecarousel.model.CarouselItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    CategoryAdapter categoryAdapter;
    ArrayList<Category> categories;

    ProductAdapter productAdapter;
    ArrayList<Product> products;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initCategories();
        initProudcts();
        initCarosoul();


    }

    private void initCarosoul() {
        binding.carousel.addData(new CarouselItem("https://tutorials.mianasad.com/ecommerce/uploads/news/Available%20Best%20Interior%20Stuff%20Browse%20and%20Discover%20Now%20for%20Your%20Room.jpg","exciting deals at your door. Order now!"));
        binding.carousel.addData(new CarouselItem("https://tutorials.mianasad.com/ecommerce/uploads/news/We%20Join%20Smartphone%20Fair%20%20in%20Washington%20DC%20April%2078%202017%20Visit%20and%20Purchase%20our%20Product.jpg","exciting deals at your door. Order now!"));
        binding.carousel.addData(new CarouselItem("https://tutorials.mianasad.com/ecommerce/uploads/news/Kaktus%20Yang%20Cantik.jpg","exciting deals at your door. Order now!"));
    }

    void initCategories(){
        categories = new ArrayList<>();
        categories.add(new Category("Babies & Toys","https://tutorials.mianasad.com/ecommerce/uploads/category/1651894486743.png","#18ab4e","some description",1));
        categories.add(new Category("Babies & Toys","https://tutorials.mianasad.com/ecommerce/uploads/category/1651894486743.png","#fcba03","some description",1));
        categories.add(new Category("Babies & Toys","https://tutorials.mianasad.com/ecommerce/uploads/category/1651894486743.png","#7ffc03","some description",1));
        categories.add(new Category("Babies & Toys","https://tutorials.mianasad.com/ecommerce/uploads/category/1651894486743.png","#03bafc","some description",1));
        categories.add(new Category("Babies & Toys","https://tutorials.mianasad.com/ecommerce/uploads/category/1651894486743.png","#fc0330","some description",1));
        categories.add(new Category("Babies & Toys","https://tutorials.mianasad.com/ecommerce/uploads/category/1651894486743.png","#fc03db","some description",1));
        categories.add(new Category("Babies & Toys","https://tutorials.mianasad.com/ecommerce/uploads/category/1651894486743.png","#fcec03","some description",1));

        categoryAdapter = new CategoryAdapter(this,categories);



        GridLayoutManager layoutManager = new GridLayoutManager(this,4);
        binding.catergoriesList.setLayoutManager(layoutManager);
        binding.catergoriesList.setAdapter(categoryAdapter);
    }

    void initProudcts(){
        products = new ArrayList<>();

        products.add(new Product("Korean Loose Short Cowboy Outerwear","https://tutorials.mianasad.com/ecommerce/uploads/product/1650597798314.jpg","",12,12,1,1));
        products.add(new Product("Korean Loose Short Cowboy Outerwear","https://tutorials.mianasad.com/ecommerce/uploads/product/1650597798314.jpg","",12,12,1,1));
        products.add(new Product("Korean Loose Short Cowboy Outerwear","https://tutorials.mianasad.com/ecommerce/uploads/product/1650597798314.jpg","",12,12,1,1));
        products.add(new Product("Korean Loose Short Cowboy Outerwear","https://tutorials.mianasad.com/ecommerce/uploads/product/1650597798314.jpg","",12,12,1,1));
        products.add(new Product("Korean Loose Short Cowboy Outerwear","https://tutorials.mianasad.com/ecommerce/uploads/product/1650597798314.jpg","",12,12,1,1));
        products.add(new Product("Korean Loose Short Cowboy Outerwear","https://tutorials.mianasad.com/ecommerce/uploads/product/1650597798314.jpg","",12,12,1,1));
        products.add(new Product("Korean Loose Short Cowboy Outerwear","https://tutorials.mianasad.com/ecommerce/uploads/product/1650597798314.jpg","",12,12,1,1));
        products.add(new Product("Korean Loose Short Cowboy Outerwear","https://tutorials.mianasad.com/ecommerce/uploads/product/1650597798314.jpg","",12,12,1,1));

        productAdapter = new ProductAdapter(this,products);

        GridLayoutManager layoutManager = new GridLayoutManager(this,2);
        binding.productList.setLayoutManager(layoutManager);
        binding.productList.setAdapter(productAdapter);
    }
}