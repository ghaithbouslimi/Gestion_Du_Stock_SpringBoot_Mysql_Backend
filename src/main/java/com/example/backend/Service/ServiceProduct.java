package com.example.backend.Service;

import com.example.backend.Entity.Product;
import com.example.backend.Repository.RepProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceProduct {

    @Autowired
    private RepProduct repositoryProduct ;

    public List<Product> getAllProduct()
    {
        return repositoryProduct.findAll();
    }

    public Optional<Product> getOne(Long id)
    {
        return repositoryProduct.findById(id);
    }
    public Product findByid(Long id)
    {
        return repositoryProduct.findById(id).get();
    }

    public Product saveProduct(Product product)
    {
        return repositoryProduct.save(product);
    }
    public Product updateProduct(Product product)
    {
        return repositoryProduct.save(product);
    }

    public boolean exsitById(Long id )
    {
        return repositoryProduct.existsById(id);
    }
    public void DeleteProduct(Long id)
    {
        Product product = findByid(id);
        repositoryProduct.delete(product);
    }
}
