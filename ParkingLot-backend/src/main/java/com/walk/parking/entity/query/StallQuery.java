package com.walk.parking.entity.query;


import lombok.Data;

/**
 * 停车位信息 查询对象
 *
 * @author: ShanZhu
 * @date: 2024-5-25
 */
@Data
public class StallQuery {

    /**
     * 停车区域
     */
    private String carArea;

    /**
     * 车位类型
     */
    private String carType;

    /**
     * 车位状态
     */
    private String carState;

    /**
     * 分页页数
     */
    private Integer pagenum;

    /**
     * 分页大学
     */
    private Integer pageSize;

}
