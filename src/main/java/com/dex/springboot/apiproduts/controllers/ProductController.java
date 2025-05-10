package com.dex.springboot.apiproduts.controllers;

import com.dex.springboot.apiproduts.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired //ponto de injeção da interface
    ProductRepository productRepository;

}
