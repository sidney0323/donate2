
package com.zhu.donate.controller;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.zhu.donate.common.Result;
import com.zhu.donate.common.StringConsts;
import com.zhu.donate.entity.User;
import com.zhu.donate.service.IUserService;
import com.zhu.donate.utils.FormatUtils;
import com.zhu.donate.vo.request.RequestUserRegisterVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * user的控制层
 */
@RestController
@RequestMapping("/user/")
public class UserController {

    @Autowired
    private IUserService userService;
    @PostMapping("register")
    public Result register(@RequestBody RequestUserRegisterVo requestUserRegisterVo){
        //判断电话号码格式
        if(!FormatUtils.isMobile(requestUserRegisterVo.getTelephone())){
            return  Result.getFailure().setMsg(StringConsts.TELEPHONE_ERROR);
        }
        //判断电话是否已经注册
        User user = userService.getByTelephone(requestUserRegisterVo.getTelephone());
            if(StringUtils.checkValNotNull(user)){
                return Result.getFailure().setMsg(StringConsts.USER_EXIST);
            }
            if(userService.register(requestUserRegisterVo)){
                return Result.getSuccess().setMsg(StringConsts.REGISTER_SUCCESS);
            }
            else{
                return Result.getFailure().setMsg(StringConsts.REGISTER_FAIL);
            }
        }
    }

