package com.fabiankevin.springbootcleanarchitecture.component.persitence.repository;

import com.fabiankevin.springbootcleanarchitecture.component.persitence.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}
