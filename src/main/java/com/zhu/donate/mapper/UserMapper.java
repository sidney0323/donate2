package com.zhu.donate.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhu.donate.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * user持久层
 */

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
