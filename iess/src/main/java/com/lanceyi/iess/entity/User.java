package com.lanceyi.iess.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Lance YI
 * @date 2019/7/24 9:21
 */
@Data
@Entity
@Table(name = "iess_user")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    // 用户名
    private String username;
    // 密码
    private String password;
    // 性别
    private Integer gender;
    // 生日
    private Long birthday;
    // 注册时间
    private Long registerTime;
    // 注册ip
    private String registerIp;
    // 最后登录时间
    private Long lastLoginTime;
    // 最后登录ip
    private String lastLoginIp;
    // 昵称
    private String nickname;
    // 手机号
    private String mobile;
    // 头像
    private String avatar;
    // 微信openid
    private String wxOpenid;

}
