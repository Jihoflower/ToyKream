package com.toykream.dto.product;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("product")
public class ProductDTO {
    private int productId;
    private String productName;
    private String productNum;
    private String productImg;
    private int productCategory;
    private int productBrand;
    private int productColor;


}
