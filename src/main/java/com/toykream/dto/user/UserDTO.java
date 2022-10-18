package com.toykream.dto.user;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
@Alias("user")
public class UserDTO {
    private int user_id;
    private String user_name;
    private String user_email;
    private int user_point;
    private int user_shoe_size;
}
