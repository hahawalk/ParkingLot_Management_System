package com.walk.parking.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.walk.parking.entity.po.Car;
import org.apache.ibatis.annotations.Mapper;

/**
 * 车辆 持久层
 *
 * @author: ShanZhu
 * @date: 2024-5-25
 */
@Mapper
public interface CarMapper extends BaseMapper<Car> {

}
