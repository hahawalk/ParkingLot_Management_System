package com.walk.parking.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.walk.parking.entity.po.Fee;
import org.apache.ibatis.annotations.Mapper;

/**
 * 车辆收费信息 持久层
 *
 * @author: ShanZhu
 * @date: 2024-5-25
 */
@Mapper
public interface FeeMapper extends BaseMapper<Fee> {

}
