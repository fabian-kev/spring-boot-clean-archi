package com.fabiankevin.springbootcleanarchitecture.feature.service;

import com.fabiankevin.springbootcleanarchitecture.component.domain.model.Product;
import com.fabiankevin.springbootcleanarchitecture.feature.dto.request.ProductForm;
import com.fabiankevin.springbootcleanarchitecture.feature.dto.response.ProductResource;

public interface ProductService {
    ProductResource getProduct(Long id);
    void updateProduct(ProductForm form);
}
