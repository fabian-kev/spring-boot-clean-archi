package com.fabiankevin.springbootcleanarchitecture.feature.interactor;

import com.fabiankevin.springbootcleanarchitecture.component.domain.model.Product;
import com.fabiankevin.springbootcleanarchitecture.component.gateway.ProductGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GetProductImpl implements GetProduct {
    private final ProductGateway productGateway;
    @Override
    public Product execute(Long id) {
        return productGateway.getProduct(id);
    }
}
