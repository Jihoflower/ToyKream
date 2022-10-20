package com.toykream.mapper.common;

import com.toykream.dto.size.SizeDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface SizeMapper {

  void insertSize(SizeDTO size);
}
