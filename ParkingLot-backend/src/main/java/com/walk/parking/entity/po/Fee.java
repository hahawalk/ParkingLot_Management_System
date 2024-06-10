package com.walk.parking.entity.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 车位收费信息
 *
 * @author: ShanZhu
 * @date: 2024-5-25
 */
@Data
public class Fee implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 收费标准ID
     */
    @TableId(value = "fid", type = IdType.AUTO)
    private Integer fid;

    /**
     * 车位类型
     */
    private String carType;

    /**
     * 价格
     */
    private Double money;

    /**
     * 价格描述
     */
    private String moneyDesc;

    /**
     * 创建时间
     */
    private LocalDateTime feeTime;

}
