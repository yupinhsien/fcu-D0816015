package fcu.sep.fcushop.controller;

import fcu.sep.fcushop.model.Product;
import fcu.sep.fcushop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productManager;

    @GetMapping("/product")
    public  List<Product> getProduct(){
        return  productManager.getProducts();
    }
}
