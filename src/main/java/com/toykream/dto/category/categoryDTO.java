package com.toykream.dto.category;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("category")
public class categoryDTO {
    private int categoryId;
    private String categoryName;

}
