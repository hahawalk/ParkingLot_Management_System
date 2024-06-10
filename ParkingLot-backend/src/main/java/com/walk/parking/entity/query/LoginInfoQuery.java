package com.walk.parking.entity.query;

import lombok.Data;

/**
 * 用户信息 查询对象
 *
 * @author: ShanZhu
 * @date: 2024-5-25
 */
@Data
public class LoginInfoQuery {

    /**
     * 用户名
     */
    private String person;

    /**
     * ip
     */
    private String ip;

    /**
     * 分页大小
     */
    private Integer pageSize;

    /**
     * 分页页数
     */
    private Integer pagenum;

}
