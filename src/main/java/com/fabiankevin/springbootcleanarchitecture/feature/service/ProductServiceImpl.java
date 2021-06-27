package com.fabiankevin.springbootcleanarchitecture.feature.service;

import com.fabiankevin.springbootcleanarchitecture.component.domain.model.Product;
import com.fabiankevin.springbootcleanarchitecture.feature.dto.request.ProductForm;
import com.fabiankevin.springbootcleanarchitecture.feature.dto.response.ProductResource;
import com.fabiankevin.springbootcleanarchitecture.feature.interactor.GetProduct;
import com.fabiankevin.springbootcleanarchitecture.feature.interactor.SaveProduct;
import com.fabiankevin.springbootcleanarchitecture.feature.interactor.SendNotification;
import com.fabiankevin.springbootcleanarchitecture.feature.interactor.ValidateProduct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final GetProduct getProduct;
    private final SaveProduct saveProduct;
    private final SendNotification sendNotification;
    private final ValidateProduct validateProduct;


    @Override
    public ProductResource getProduct(Long id) {
        Product product = getProduct.execute(id);
        return ProductResource
                .builder()
                .category(product.getCategory())
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .build();
    }

    @Override
    public void updateProduct(ProductForm form) {
        validateProduct.execute(
                Product.builder()
                        .id(form.getId())
                        .name(form.getName())
                        .description(form.getDescription())
                        .category(form.getCategory())
                        .build()
        );
        Product product = getProduct.execute(form.getId());
        //set product fields
        product.setName(form.getName());
        saveProduct.execute(product);
        sendNotification.execute();

    }


}
