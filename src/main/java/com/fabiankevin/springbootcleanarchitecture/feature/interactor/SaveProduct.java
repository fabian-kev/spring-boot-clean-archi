package com.fabiankevin.springbootcleanarchitecture.feature.interactor;

import com.fabiankevin.springbootcleanarchitecture.component.domain.model.Product;

public interface SaveProduct {
    Product execute(Product product);
}
