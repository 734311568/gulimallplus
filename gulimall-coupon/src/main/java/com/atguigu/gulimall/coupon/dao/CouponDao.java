package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author yjc
 * @email 734311568@qq.com
 * @date 2020-07-04 10:04:51
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
