package com.fabiankevin.springbootcleanarchitecture.feature.interactor;

import com.fabiankevin.springbootcleanarchitecture.component.domain.model.Product;

public interface GetProduct {
    Product execute(Long id);
}
