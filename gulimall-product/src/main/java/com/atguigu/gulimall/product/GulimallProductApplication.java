package com.atguigu.gulimall.product;
/**
 * 整合mybatisplus
 *     1导入依赖
 *     2配置
 *       2.1 配置数据源
 *       2.2 配置mybaitspus
 *          2.2.1 再主程序上@MapperScan("com.atguigu.gulimall.product.dao")启动类配置mybatis 扫描接口注解
 *          2.2.2 再yml 上配置mapper.xml 文件的在哪里
 *
 *
 *
 */
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.atguigu.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
