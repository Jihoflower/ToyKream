package com.toykream.service.product;

import com.toykream.dto.brand.BrandDTO;
import com.toykream.dto.category.CategoryDTO;
import com.toykream.dto.color.ColorDTO;
import com.toykream.dto.size.SizeDTO;
import com.toykream.mapper.common.BrandMapper;
import com.toykream.mapper.common.CategoryMapper;
import com.toykream.mapper.common.ColorMapper;
import com.toykream.mapper.common.SizeMapper;
import com.toykream.mapper.product.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {


    @Autowired
    ProductMapper productMapper;
    @Autowired
    BrandMapper brandMapper;
    @Autowired
    CategoryMapper categoryMapper;
    @Autowired
    SizeMapper sizeMapper;
    @Autowired
    ColorMapper colorMapper;

    public void insertBrand(BrandDTO brand){
        brandMapper.insertBrand(brand);
    }
    public List<BrandDTO> selectBrandAll(){
        System.out.println("List = "+brandMapper.selectAllBrand());
        return brandMapper.selectAllBrand();
    }




    public void insertCategory(CategoryDTO category){
        categoryMapper.insertCategory(category);
    }

    public void insertColor(ColorDTO color){
        colorMapper.insertBrand(color);
    }

    public void insertSize(SizeDTO size){
        sizeMapper.insertSize(size);
    }
}
