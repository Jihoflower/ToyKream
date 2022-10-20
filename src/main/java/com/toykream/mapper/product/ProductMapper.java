package com.toykream.mapper.product;

import com.toykream.dto.product.ProductDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface ProductMapper {
    void createProduct(ProductDTO product);
}
