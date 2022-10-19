package com.toykream.dto.purchase;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.util.Date;

@Data
@Alias("purchase")
public class PurchaseDTO {
    private int purchaseId;
    private int userId;
    private int prodinfoId;
    private Date purchaseRegdate;
    private boolean purchaseStatus;

}
