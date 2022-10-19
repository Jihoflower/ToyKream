package com.toykream.dto.size;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("size")
public class SizeDTO {
    private int sizeId;
    private String sizeName;

}
