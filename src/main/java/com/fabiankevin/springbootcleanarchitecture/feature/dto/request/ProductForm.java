package com.fabiankevin.springbootcleanarchitecture.feature.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class ProductForm {
    private Long id;
    private String name;
    private String description;
    private String category;
}
