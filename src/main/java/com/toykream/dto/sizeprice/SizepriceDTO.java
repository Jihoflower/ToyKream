package com.toykream.dto.sizeprice;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("sizeprice")
public class SizepriceDTO {

    private int sizepriceId;
    private int sizeId;
    private int sizepricePrice;
    private String sizepriceStatus;
    private int buyerId;

}
