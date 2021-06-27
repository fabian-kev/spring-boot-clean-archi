package com.fabiankevin.springbootcleanarchitecture.feature.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class ProductResource {
    private Long id;
    private String name;
    private String description;
    private String category;
}
