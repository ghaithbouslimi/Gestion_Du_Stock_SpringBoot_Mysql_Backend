package com.example.backend.Controller;

import com.example.backend.Entity.LigneProduction;
import com.example.backend.Entity.Product;
import com.example.backend.Service.ServiceLigneProduction;
import com.example.backend.Service.ServiceProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/sagemProduct")
public class ApiProduct {
    @Autowired
    private ServiceProduct serviceProduct ;


    @GetMapping("/AllProducts")
    public List<Product> getAllProduct()
    {
        return serviceProduct.getAllProduct();
    }

    @GetMapping("/Product/{id}")
    public ResponseEntity<Product> getProductByID(@PathVariable("id") Long id) {
        Optional<Product> LigneProduction = serviceProduct.getOne(id);

        if (LigneProduction.isPresent()) {
            return new ResponseEntity<>(LigneProduction.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/createProduct")
    public Product postProduct(@RequestBody Product product)
    {
        return serviceProduct.saveProduct(product) ;
    }
    @PutMapping("/update/Product")
    public Product updateProduct(@RequestBody Product product) {
        return serviceProduct.updateProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<HttpStatus> deleteProduct(@PathVariable("id") long id) {
        try {
            serviceProduct.DeleteProduct(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
