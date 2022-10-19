package com.toykream.dto.brand;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("brand")
public class BrandDTO {
    private int brandId;
    private String brandName;

}
