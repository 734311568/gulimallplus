package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author yjc
 * @email 734311568@qq.com
 * @date 2020-07-04 10:25:41
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
