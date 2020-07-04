package com.atguigu.gulimall.product;

import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;


import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class GulimallProductApplicationTests {
    @Autowired
    BrandService brandService;
    @Test
    void contextLoads() {
        BrandEntity brandEntity=new BrandEntity();
        brandEntity.setName("华为");
        brandService.save(brandEntity);
        System.out.println("保存成功");
    }
    @Test
    //根据id 好修改实体
    public  void  testUpdate(){

        BrandEntity brandEntity=new BrandEntity();
        brandEntity.setBrandId(2L);
        brandEntity.setDescript("性价比高");
        brandService.updateById(brandEntity);
        System.out.println("修改成功");
    }
    @Test
    public  void getListEntity(){

//        BrandEntity brandEntity=new BrandEntity();
//        brandEntity.setBrandId(1L);
        List<BrandEntity> brandEntityList = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        brandEntityList.forEach((entity) ->{
            System.out.println(entity);
            // System.out.print(entity.getBrandId() +"\r"+entity.getName()+"\r"+entity.getDescript());

        });
        System.out.println("遍历集合完毕");
    }

}
