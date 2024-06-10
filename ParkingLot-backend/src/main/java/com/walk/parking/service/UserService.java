package com.walk.parking.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.walk.parking.entity.dto.DateType;
import com.walk.parking.entity.po.User;
import com.walk.parking.entity.query.UserQuery;
import com.walk.parking.entity.vo.UserInfoVo;

import java.util.List;

/**
 * 用户信息 服务层
 *
 * @author: ShanZhu
 * @date: 2024-5-25
 */
public interface UserService extends IService<User> {

    /**
     * 用户登录
     *
     * @param user 用户信息
     * @return 登录结果
     */
    UserInfoVo login(User user);

    /**
     * 用户注册
     *
     * @param user 用户信息
     * @return boolean
     */
    Boolean register(User user);

    /**
     * 新增用户
     *
     * @param user 用户信息
     * @return boolean
     */
    Boolean add(User user);

    /**
     * 删除用户
     *
     * @param uid 用户id
     * @return boolean
     */
    Boolean delUser(Integer uid);

    /**
     * 更新用户信息
     *
     * @param user 用户信息
     * @return boolean
     */
    Boolean updateUser(User user);

    /**
     * 用户更新个人信息
     *
     * @param user 用户信息
     * @return 结果
     */
    Boolean updateByUser(User user);

    /**
     * 重置密码
     *
     * @param uid 用户编号
     * @return boolean
     */
    boolean resetPassword(Integer uid);

    /**
     * 分页获取用户
     *
     * @param userQuery 条件信息
     * @return 用户
     */
    IPage<User> getUsersPage(UserQuery userQuery);

    /**
     * 用户充值
     *
     * @param user 用户信息
     * @return Boolean
     */
    Boolean userPay(User user);

    /**
     * 获取用户停车类型记录
     *
     * @param person 用户
     * @return 停车位类型
     */
    List<DateType> getUserDataType(String person);

    /**
     * 获取用户缴费记录
     *
     * @param person 用户
     * @return 缴费记录
     */
    List<DateType> getUserDataMoney(String person);

}
