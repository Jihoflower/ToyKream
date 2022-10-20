package com.toykream.mapper.common;

import com.toykream.dto.color.ColorDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface ColorMapper {

  void insertBrand(ColorDTO color);
}
