package com.amer.service;

import com.amer.business.ProductServiceImpl;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public class ProductService {
    ProductServiceImpl productServiceImpl = new ProductServiceImpl();

    @WebMethod
    public List<String> getAllCategories()
    {
        return productServiceImpl.getAllCategories();
    }

    @WebMethod
    public List<String> getAllProducts(String category)
    {
        return productServiceImpl.getAllProducts(category);
    }

    @WebMethod
    public boolean addProduct(String category , String product)
    {
        return productServiceImpl.addProduct(category , product);
    }
}
