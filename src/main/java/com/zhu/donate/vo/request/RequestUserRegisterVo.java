package com.zhu.donate.vo.request;

import lombok.Data;

/**
 * 用户注册请求vo
 */
@Data
public class RequestUserRegisterVo {

    private String username;

    private String password;

    private String telephone;

    private String sex;

    private Integer age;

    /**
     * 用户学历
     */
    private String educational;
    /**
     * 用户职业
     */
    private String job;
    /**
     * 个性签名
     */
    private String remark;
    /**
     * 头像
     */
    private String image;

}
