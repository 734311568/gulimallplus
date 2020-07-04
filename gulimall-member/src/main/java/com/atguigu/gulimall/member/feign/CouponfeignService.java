package com.atguigu.gulimall.member.feign;


import com.atguigu.gulimall.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 声明是接口
 *
 */

@FeignClient("gulimall-coupon") //先找微服务名
public interface CouponfeignService {
    @RequestMapping("coupon/coupon/member/list") //写好全路径
    public R memberCoupon();
}
