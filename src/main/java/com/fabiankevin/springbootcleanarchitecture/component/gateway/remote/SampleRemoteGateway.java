package com.fabiankevin.springbootcleanarchitecture.component.gateway.remote;

import com.fabiankevin.springbootcleanarchitecture.component.domain.model.Product;

public interface SampleRemoteGateway {
    Product getProduct(Long id);
}
