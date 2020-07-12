package com.boss.mall.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.boss.mall.entity.Goods;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author shkstart
 * @create 2020-07-12 9:10
 */
@Mapper
public interface GoodsDAO extends BaseMapper<Goods> {
}
