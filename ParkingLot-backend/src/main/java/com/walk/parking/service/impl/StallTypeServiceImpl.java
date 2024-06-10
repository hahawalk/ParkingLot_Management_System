package com.walk.parking.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.walk.parking.entity.po.StallType;
import com.walk.parking.mapper.StallTypeMapper;
import com.walk.parking.service.StallTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * 车位类型 服务层实现类
 *
 * @author: ShanZhu
 * @date: 2024-5-25
 */
@Service
@RequiredArgsConstructor
public class StallTypeServiceImpl extends ServiceImpl<StallTypeMapper, StallType> implements StallTypeService {

}
