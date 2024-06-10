package com.walk.parking.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.walk.parking.entity.po.Recharge;
import com.walk.parking.mapper.RechargeMapper;
import com.walk.parking.service.RechargeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * 充值 服务层实现类
 *
 * @author: ShanZhu
 * @date: 2024-5-25
 */
@Service
@RequiredArgsConstructor
public class RechargeServiceImpl extends ServiceImpl<RechargeMapper, Recharge> implements RechargeService {

}
