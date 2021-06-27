package com.fabiankevin.springbootcleanarchitecture.feature.controller;

import com.fabiankevin.springbootcleanarchitecture.feature.dto.response.ProductResource;
import com.fabiankevin.springbootcleanarchitecture.feature.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/product")
public class ProductController {
    private final ProductService productService;

    @GetMapping("/{id}")
    ProductResource getById(@PathVariable Long id) {
        return productService.getProduct(id);
    }
}
