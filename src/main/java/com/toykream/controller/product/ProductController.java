package com.toykream.controller.product;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.toykream.dto.brand.BrandDTO;
import com.toykream.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/brand")
    public String insertBrand(BrandDTO brand){
        System.out.println("brand add = "+brand);
        productService.insertBrand(brand);
        String brandName = brand.getBrandName();
        return "redirect:/product/brand";

    }
    @GetMapping("/brand")

    public String selectAllBrand(Model blist){
        blist.addAttribute("brandList",productService.selectBrandAll());
        return "/admin/product/brand";
    }

    @GetMapping("/ajax-brand")
    @ResponseBody
    public String ajaxSelectAll(){
        System.out.println("ajax 컨트롤러 실행");
        String json = new Gson().toJson(productService.selectBrandAll());
        System.out.println("제이슨 결과2 = " + json);
        return json;
    }




}
