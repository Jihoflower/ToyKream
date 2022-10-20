package com.toykream.mapper.common;

import com.toykream.dto.brand.BrandDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface BrandMapper {

  void insertBrand(BrandDTO brand);
  void deleteBrand(String brandName);
  List<BrandDTO> selectAllBrand();
}
