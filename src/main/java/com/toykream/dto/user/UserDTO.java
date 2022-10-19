package com.toykream.dto.user;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.util.Date;

@Data
@Alias("user")
public class UserDTO {
    private int userId;
    private String userEmail;
    private String userPassword;
    private String userName;
    private int userNum;
    private String userProfile;
    private String userAddress;
    private int userPoint;
    private Date userRegdate;
    private int userSize;
}
