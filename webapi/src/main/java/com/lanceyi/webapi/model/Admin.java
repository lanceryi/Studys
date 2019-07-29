package com.lanceyi.webapi.model;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "`admin`")
public class Admin implements Serializable {
    /**
     * 用户id
     */
    @Id
    @Column(name = "`admin_id`")
    private Integer adminId;

    /**
     * 真实姓名
     */
    @Column(name = "`real_name`")
    private String realName;

    /**
     * 登录账户
     */
    @Column(name = "`login_name`")
    private String loginName;

    /**
     * 登录密码
     */
    @Column(name = "`login_pwd`")
    private String loginPwd;

    /**
     * 性别男0女1
     */
    @Column(name = "`admin_sex`")
    private Byte adminSex;

    /**
     * 手机号
     */
    @Column(name = "`admin_phone`")
    private String adminPhone;

    /**
     * 激活状态（0为未激活 1为已激活）
     */
    @Column(name = "`admin_activation`")
    private Byte adminActivation;

    /**
     * 有效状态(0为无效 1为有效)
     */
    @Column(name = "`admin_effective`")
    private Byte adminEffective;

    /**
     * 创建时间
     */
    @Column(name = "`create_time`")
    private Integer createTime;

    /**
     * 最后登录Ip
     */
    @Column(name = "`last_ip`")
    private String lastIp;

    /**
     * 最后登录时间
     */
    @Column(name = "`last_time`")
    private Integer lastTime;

    /**
     * 与admin_type表关联 -1超级管理员
     */
    @Column(name = "`admin_type`")
    private Integer adminType;

    /**
     * 用户的创建者(存创建者的admin_id)
     */
    @Column(name = "`creator`")
    private Integer creator;

    /**
     * 权限id
     */
    @Column(name = "`root_id`")
    private String rootId;

    /**
     * 备注
     */
    @Column(name = "`note`")
    private String note;

    private static final long serialVersionUID = 1L;

    /**
     * 获取用户id
     *
     * @return admin_id - 用户id
     */
    public Integer getAdminId() {
        return adminId;
    }

    /**
     * 设置用户id
     *
     * @param adminId 用户id
     */
    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    /**
     * 获取真实姓名
     *
     * @return real_name - 真实姓名
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 设置真实姓名
     *
     * @param realName 真实姓名
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * 获取登录账户
     *
     * @return login_name - 登录账户
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * 设置登录账户
     *
     * @param loginName 登录账户
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    /**
     * 获取登录密码
     *
     * @return login_pwd - 登录密码
     */
    public String getLoginPwd() {
        return loginPwd;
    }

    /**
     * 设置登录密码
     *
     * @param loginPwd 登录密码
     */
    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd == null ? null : loginPwd.trim();
    }

    /**
     * 获取性别男0女1
     *
     * @return admin_sex - 性别男0女1
     */
    public Byte getAdminSex() {
        return adminSex;
    }

    /**
     * 设置性别男0女1
     *
     * @param adminSex 性别男0女1
     */
    public void setAdminSex(Byte adminSex) {
        this.adminSex = adminSex;
    }

    /**
     * 获取手机号
     *
     * @return admin_phone - 手机号
     */
    public String getAdminPhone() {
        return adminPhone;
    }

    /**
     * 设置手机号
     *
     * @param adminPhone 手机号
     */
    public void setAdminPhone(String adminPhone) {
        this.adminPhone = adminPhone == null ? null : adminPhone.trim();
    }

    /**
     * 获取激活状态（0为未激活 1为已激活）
     *
     * @return admin_activation - 激活状态（0为未激活 1为已激活）
     */
    public Byte getAdminActivation() {
        return adminActivation;
    }

    /**
     * 设置激活状态（0为未激活 1为已激活）
     *
     * @param adminActivation 激活状态（0为未激活 1为已激活）
     */
    public void setAdminActivation(Byte adminActivation) {
        this.adminActivation = adminActivation;
    }

    /**
     * 获取有效状态(0为无效 1为有效)
     *
     * @return admin_effective - 有效状态(0为无效 1为有效)
     */
    public Byte getAdminEffective() {
        return adminEffective;
    }

    /**
     * 设置有效状态(0为无效 1为有效)
     *
     * @param adminEffective 有效状态(0为无效 1为有效)
     */
    public void setAdminEffective(Byte adminEffective) {
        this.adminEffective = adminEffective;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Integer getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取最后登录Ip
     *
     * @return last_ip - 最后登录Ip
     */
    public String getLastIp() {
        return lastIp;
    }

    /**
     * 设置最后登录Ip
     *
     * @param lastIp 最后登录Ip
     */
    public void setLastIp(String lastIp) {
        this.lastIp = lastIp == null ? null : lastIp.trim();
    }

    /**
     * 获取最后登录时间
     *
     * @return last_time - 最后登录时间
     */
    public Integer getLastTime() {
        return lastTime;
    }

    /**
     * 设置最后登录时间
     *
     * @param lastTime 最后登录时间
     */
    public void setLastTime(Integer lastTime) {
        this.lastTime = lastTime;
    }

    /**
     * 获取与admin_type表关联 -1超级管理员
     *
     * @return admin_type - 与admin_type表关联 -1超级管理员
     */
    public Integer getAdminType() {
        return adminType;
    }

    /**
     * 设置与admin_type表关联 -1超级管理员
     *
     * @param adminType 与admin_type表关联 -1超级管理员
     */
    public void setAdminType(Integer adminType) {
        this.adminType = adminType;
    }

    /**
     * 获取用户的创建者(存创建者的admin_id)
     *
     * @return creator - 用户的创建者(存创建者的admin_id)
     */
    public Integer getCreator() {
        return creator;
    }

    /**
     * 设置用户的创建者(存创建者的admin_id)
     *
     * @param creator 用户的创建者(存创建者的admin_id)
     */
    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    /**
     * 获取权限id
     *
     * @return root_id - 权限id
     */
    public String getRootId() {
        return rootId;
    }

    /**
     * 设置权限id
     *
     * @param rootId 权限id
     */
    public void setRootId(String rootId) {
        this.rootId = rootId == null ? null : rootId.trim();
    }

    /**
     * 获取备注
     *
     * @return note - 备注
     */
    public String getNote() {
        return note;
    }

    /**
     * 设置备注
     *
     * @param note 备注
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", adminId=").append(adminId);
        sb.append(", realName=").append(realName);
        sb.append(", loginName=").append(loginName);
        sb.append(", loginPwd=").append(loginPwd);
        sb.append(", adminSex=").append(adminSex);
        sb.append(", adminPhone=").append(adminPhone);
        sb.append(", adminActivation=").append(adminActivation);
        sb.append(", adminEffective=").append(adminEffective);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastIp=").append(lastIp);
        sb.append(", lastTime=").append(lastTime);
        sb.append(", adminType=").append(adminType);
        sb.append(", creator=").append(creator);
        sb.append(", rootId=").append(rootId);
        sb.append(", note=").append(note);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}