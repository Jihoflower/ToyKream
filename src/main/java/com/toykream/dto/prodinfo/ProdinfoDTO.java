package com.toykream.dto.prodinfo;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.util.Date;

@Data
@Alias("prodinfo")
public class ProdinfoDTO {
    private int prodinfoId;
    private int productId;
    private int sizepriceId;
    private Date prodinfoRegdate;
}
