package com.toykream.dto.color;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("color")
public class ColorDTO {
    private int colorId;
    private String colorName;

}
