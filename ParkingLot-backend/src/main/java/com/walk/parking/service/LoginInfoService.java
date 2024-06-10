package com.walk.parking.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.walk.parking.entity.po.LoginInfo;
import com.walk.parking.entity.query.LoginInfoQuery;

/**
 * 登录信息 服务层
 *
 * @author: ShanZhu
 * @date: 2024-5-25
 */
public interface LoginInfoService extends IService<LoginInfo> {

    /**
     * 获取登录用户列表
     *
     * @param loginInfoQuery 用户信息
     * @return 用户列表
     */
    IPage<LoginInfo> getLoginInfoList(LoginInfoQuery loginInfoQuery);

}
