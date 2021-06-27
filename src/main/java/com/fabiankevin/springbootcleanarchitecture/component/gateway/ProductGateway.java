package com.fabiankevin.springbootcleanarchitecture.component.gateway;

import com.fabiankevin.springbootcleanarchitecture.component.domain.model.Product;

public interface ProductGateway {
    Product getProduct(Long id);
}
