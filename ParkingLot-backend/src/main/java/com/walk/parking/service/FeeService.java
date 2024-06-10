package com.walk.parking.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.walk.parking.entity.po.Fee;
import com.walk.parking.entity.po.User;
import com.walk.parking.entity.vo.MsgVo;

/**
 * 车位收费信息 服务层
 *
 * @author: ShanZhu
 * @date: 2024-5-25
 */
public interface FeeService extends IService<Fee> {

    /**
     * 更新车位收费费用
     *
     * @param fee 车位信息
     * @return 结果
     */
    MsgVo updateFee(Fee fee);

    /**
     * 用户余额充值
     *
     * @param user 用户信息
     * @return 结果
     */
    MsgVo addUserFee(User user);
}
