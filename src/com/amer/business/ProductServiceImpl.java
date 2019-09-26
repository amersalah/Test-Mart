package com.amer.business;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl {

    private List<String> bookList = new ArrayList<>();
    private List<String> movieList = new ArrayList<>();
    private List<String> musicList = new ArrayList<>();

    public ProductServiceImpl(){

        bookList.add("Spring");
        bookList.add("Hibernate");
        bookList.add("WebService");

        movieList.add("3 idiots");
        movieList.add("Call up");
        movieList.add("Titanic");

        musicList.add("Amr Diab");
        musicList.add("7ma2e");
        musicList.add("Tamer Hosney");



    }


    public List<String> getAllCategories()
    {
        List<String> categories = new ArrayList<>();
        categories.add("Books");
        categories.add("Music");
        categories.add("Movies");
        return categories;
    }

    public List<String> getAllProducts(String category)
    {
        switch (category) {

            case "books":
                return bookList;

            case "music":
                return musicList;

            case "movies":
                return movieList;
        }
        return null;
    }

    public boolean addProduct(String category , String product)
    {
        switch (category.toLowerCase())
        {
            case "books":
                bookList.add(product);
                break;
            case "music":
                musicList.add(product);
                break;
            case "movies":
                movieList.add(product);
                break;
            default:
                return false;
        }
        return true;
    }

}
