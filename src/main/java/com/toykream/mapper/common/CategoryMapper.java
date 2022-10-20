package com.toykream.mapper.common;


import com.toykream.dto.category.CategoryDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface CategoryMapper {

  void insertCategory(CategoryDTO category);
}
