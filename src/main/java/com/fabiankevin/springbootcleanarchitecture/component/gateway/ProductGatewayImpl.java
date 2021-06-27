package com.fabiankevin.springbootcleanarchitecture.component.gateway;

import com.fabiankevin.springbootcleanarchitecture.component.domain.model.Product;
import com.fabiankevin.springbootcleanarchitecture.component.persitence.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ProductGatewayImpl implements ProductGateway {
    private final ProductRepository productRepository;

    @Override
    public Product getProduct(Long id) {
        return productRepository.findById(id)
                .map(entity -> Product.builder()
                        .category(entity.getCategory())
                        .id(entity.getId())
                        .name(entity.getName())
                        .description(entity.getDescription())
                        .build()
                ).orElseThrow(() -> new RuntimeException(String.format("Unable to find product with id %s", id)));
    }
}
