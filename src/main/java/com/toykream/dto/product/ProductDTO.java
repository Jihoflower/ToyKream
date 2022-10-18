package com.toykream.dto.product;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("product")
public class ProductDTO {
    private int product_id;
    private String product_name;
    private int product_price;
    private int product_size;
}
