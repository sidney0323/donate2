package com.zhu.donate.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fasterxml.jackson.databind.util.BeanUtil;
import com.zhu.donate.entity.User;
import com.zhu.donate.mapper.UserMapper;
import com.zhu.donate.service.IUserService;
import com.zhu.donate.utils.Md5Utils;
import com.zhu.donate.vo.request.RequestUserRegisterVo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

/**
 * User服务层
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Override
    public User getByTelephone(String telephone) {

        QueryWrapper<User> queryWrapper = new QueryWrapper();
        queryWrapper.eq( "telephone",telephone);

        return getOne(queryWrapper);
    }

    @Override
    public boolean register(RequestUserRegisterVo requestUserRegisterVo) {
        User user = new User();

        //拷贝属性
        BeanUtils.copyProperties(requestUserRegisterVo,user);
        user.setPassword(Md5Utils.getPwd(requestUserRegisterVo.getPassword()));
        return save(user);
    }































































































































































}
