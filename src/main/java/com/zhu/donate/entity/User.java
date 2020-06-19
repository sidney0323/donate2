package com.zhu.donate.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.Date;


/**
 * 用户实体类
 */
@Setter
@Getter
@ToString
public class User {

    @TableId(type= IdType.AUTO)
    private Integer id;

    private String username;

    private String password;

    private String telephone;

    private String sex;

    private Integer age;

    private String educational;

    private String job;

    private String remark;

    private String image;


}
