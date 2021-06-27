package com.fabiankevin.springbootcleanarchitecture.feature.interactor;

import com.fabiankevin.springbootcleanarchitecture.component.domain.model.Product;

public interface ValidateProduct {
    void execute(Product product);
}
