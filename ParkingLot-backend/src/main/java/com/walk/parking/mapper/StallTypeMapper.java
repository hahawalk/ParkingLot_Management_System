package com.walk.parking.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.walk.parking.entity.po.StallType;
import org.apache.ibatis.annotations.Mapper;

/**
 * 车位类型 持久层
 *
 * @author: ShanZhu
 * @date: 2024-5-25
 */
@Mapper
public interface StallTypeMapper extends BaseMapper<StallType> {

}
