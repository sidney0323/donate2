package com.zhu.donate.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhu.donate.entity.User;
import com.zhu.donate.vo.request.RequestUserRegisterVo;

public interface IUserService extends IService<User> {
    //通过电话号码查询用户
    User getByTelephone(String telephone);

    //用户注册
    boolean register(RequestUserRegisterVo requestUserRegisterVo);
}
