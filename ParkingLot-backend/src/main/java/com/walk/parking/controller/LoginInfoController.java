package com.walk.parking.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.walk.parking.common.R;
import com.walk.parking.entity.po.LoginInfo;
import com.walk.parking.entity.query.LoginInfoQuery;
import com.walk.parking.service.LoginInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 登录信息 控制层
 *
 * @author: ShanZhu
 * @date: 2024-5-25
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/login-info")
public class LoginInfoController {

    private final LoginInfoService loginInfoService;

    /**
     * 获取登录用户列表
     *
     * @param loginInfoQuery 用户信息
     * @return 用户列表
     */
    @PostMapping("/getLoginInfoList")
    public R<IPage<LoginInfo>> getStallList(@RequestBody LoginInfoQuery loginInfoQuery) {
        return R.success(loginInfoService.getLoginInfoList(loginInfoQuery));
    }
}

