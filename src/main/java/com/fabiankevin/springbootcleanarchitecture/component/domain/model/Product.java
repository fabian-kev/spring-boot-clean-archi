package com.fabiankevin.springbootcleanarchitecture.component.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Product {
    private Long id;
    private String name;
    private String description;
    private String category;
}
