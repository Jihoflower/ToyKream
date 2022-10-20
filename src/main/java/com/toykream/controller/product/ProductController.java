package com.toykream.controller.product;

import com.toykream.dto.brand.BrandDTO;
import com.toykream.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/brand")
    public String insertBrand(BrandDTO brand){
        productService.insertBrand(brand);
        return "";
    }

    @GetMapping("/brand")
    public String selectAllBrand(Model blist){
        blist.addAttribute("BrandList",productService.selectBrandAll());
        System.out.println(blist);
        return "/admin/product/brand";
    }




}
