package com.walk.parking.controller;


import com.walk.parking.common.R;
import com.walk.parking.entity.po.StallType;
import com.walk.parking.service.StallTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 车位类型 控制层
 *
 * @author: ShanZhu
 * @date: 2024-5-25
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/stallType")
public class StallTypeController {

    private final StallTypeService stallTypeService;

    /**
     * 查询车位类型
     *
     * @return 车位类型
     */
    @GetMapping("/list")
    public R<List<StallType>> getList() {
        return R.success(stallTypeService.list());
    }

}

