package com.toykream.service.user;

import com.toykream.controller.user.UserController;
import com.toykream.dto.brand.BrandDTO;
import com.toykream.dto.category.CategoryDTO;
import com.toykream.dto.user.UserDTO;
import com.toykream.mapper.user.UserMapper;
import com.toykream.service.product.ProductService;
import junit.framework.TestCase;
import org.apache.ibatis.annotations.Mapper;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/spring/root-context.xml")
public class UserServiceTest extends TestCase {

    //객체를 가져다 쓰기 위해서는 bean 생성을 해야하므로 Autowired 를 통해 spring 에게 권한을 위임
    @Autowired
    UserService userService;

    @Autowired
    UserController userController;

    @Autowired
    ProductService productService;

    // DB 유저정보 저장
//    @org.junit.Test
    public void testCreateMember() {

        UserDTO dummy = new UserDTO();

//        dummy.setUserEmail("admin@aadmin");
//        dummy.setUserPassword(userController.convertToSha("admin"));
//        dummy.setUserName("admin");
//        dummy.setUserSize((int)Math.random()*12 + 1);
//        userService.createMember(dummy);

        dummy.setUserEmail("md@md");
        dummy.setUserPassword(userController.convertToSha("md"));
        dummy.setUserName("md");
        dummy.setUserSize((int)Math.random()*12 + 1);
        userService.createMember(dummy);

//        for(int i = 0 ; i < 10 ; i++){
//            dummy.setUserEmail("test"+i+"@test");
//            dummy.setUserPassword(userController.convertToSha("test"));
//            dummy.setUserName("test"+i);
//            dummy.setUserSize((int)Math.random()*12 + 1);
//            userService.createMember(dummy);
//        }
    }



//    @Test
    public void selectOne(){
        UserDTO user = new UserDTO();
        user.setUserEmail("test@test.com");
        user.setUserPassword(userController.convertToSha("test"));

        UserDTO test =  userService.selectOne(user);
        System.out.println(test);

    }

//    @org.junit.Test
    public void testBrand() {
        BrandDTO dummy = new BrandDTO();

        for(int i = 0; i < 100 ; i++){
            dummy.setBrandName("BRAND_NAME"+i);
            productService.insertBrand(dummy);
        }

    }

    public void deleteBrand(){

    }

//    @org.junit.Test
    public void testCategory() {
        CategoryDTO dummy = new CategoryDTO();

        String arr[] = new String[]{"신발","의류","패션잡화","라이프","테크"};

        for(int i = 0 ; i < arr.length ; i++){
            dummy.setCategoryName(arr[i]);
            productService.insertCategory(dummy);
        }
    }

    @org.junit.Test
    public void testSelectAllBrand(){
        System.out.println(productService.selectBrandAll());
    }
}