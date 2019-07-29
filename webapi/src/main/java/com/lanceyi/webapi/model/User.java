package com.lanceyi.webapi.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "`user`")
public class User implements Serializable {
    /**
     * 用户id
     */
    @Id
    @Column(name = "`user_id`")
    private Integer userId;

    /**
     * 上一级ID
     */
    @Column(name = "`fromuser_one`")
    private Integer fromuserOne;

    /**
     * 上上级ID
     */
    @Column(name = "`fromuser_two`")
    private Integer fromuserTwo;

    @Column(name = "`fromuser_three`")
    private Integer fromuserThree;

    /**
     * 邀请码
     */
    @Column(name = "`invite_code`")
    private String inviteCode;

    /**
     * 二维码
     */
    @Column(name = "`qrcode`")
    private String qrcode;

    /**
     * 邀请数
     */
    @Column(name = "`Invitations`")
    private Byte invitations;

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
     * 会员昵称
     */
    @Column(name = "`user_nickname`")
    private String userNickname;

    /**
     * 性别男0女1
     */
    @Column(name = "`user_sex`")
    private Byte userSex;

    /**
     * 手机号
     */
    @Column(name = "`user_phone`")
    private String userPhone;

    /**
     * 邮箱
     */
    @Column(name = "`user_email`")
    private String userEmail;

    /**
     * 用户头像
     */
    @Column(name = "`user_photo`")
    private String userPhoto;

    /**
     * 有效状态(0为无效 1为有效)
     */
    @Column(name = "`user_effective`")
    private Byte userEffective;

    /**
     * 激活状态（0为未激活 1为已激活）
     */
    @Column(name = "`user_activation`")
    private Byte userActivation;

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
     * 上次登录时间
     */
    @Column(name = "`last_time`")
    private Integer lastTime;

    /**
     * 最后登录时间
     */
    @Column(name = "`end_time`")
    private Integer endTime;

    /**
     * 用户来源
     */
    @Column(name = "`user_from`")
    private String userFrom;

    /**
     * 用户类型0普通用户，shopid值则是店铺用户。-1地推人员，-2公司内部人员
     */
    @Column(name = "`user_type`")
    private Integer userType;

    /**
     * 用户积分
     */
    @Column(name = "`user_score`")
    private Integer userScore;

    /**
     * 账户余额
     */
    @Column(name = "`user_money`")
    private BigDecimal userMoney;

    /**
     * 总资产
     */
    @Column(name = "`total_assets`")
    private BigDecimal totalAssets;

    /**
     * 储值卡余额
     */
    @Column(name = "`pet_card_money`")
    private BigDecimal petCardMoney;

    /**
     * 福利卡余额
     */
    @Column(name = "`welfare_card`")
    private BigDecimal welfareCard;

    /**
     * 投资余额
     */
    @Column(name = "`invest_money`")
    private BigDecimal investMoney;

    /**
     * 老平台免息余额
     */
    @Column(name = "`free_money`")
    private BigDecimal freeMoney;

    /**
     * 体验金账户
     */
    @Column(name = "`ex_money`")
    private BigDecimal exMoney;

    /**
     * open_id web端 微信的用户id
     */
    @Column(name = "`open_id`")
    private String openId;

    /**
     * 第三方来源（广告 百度 头条 等..)
     */
    @Column(name = "`three_source`")
    private String threeSource;

    /**
     * 0未删除 1已删除
     */
    @Column(name = "`is_del`")
    private Byte isDel;

    /**
     * 0为真实用户 1为测试用户
     */
    @Column(name = "`is_test`")
    private Byte isTest;

    /**
     * pc端token
     */
    @Column(name = "`pc_token`")
    private String pcToken;

    /**
     * wap端token
     */
    @Column(name = "`wap_token`")
    private String wapToken;

    /**
     * 安卓和ios端token
     */
    @Column(name = "`app_token`")
    private String appToken;

    /**
     * 八戒王国pc端token
     */
    @Column(name = "`bj_pc_token`")
    private String bjPcToken;

    /**
     * 八戒王国wap端token
     */
    @Column(name = "`bj_wap_token`")
    private String bjWapToken;

    /**
     * 0 不是广发银行联名，1是广发银行联名
     */
    @Column(name = "`is_cgb`")
    private Boolean isCgb;

    /**
     * 最后修改时间
     */
    @Column(name = "`last_edit_time`")
    private Integer lastEditTime;

    /**
     * 佣金账户
     */
    @Column(name = "`commission`")
    private BigDecimal commission;

    /**
     * 0未登录过，1已登录过
     */
    @Column(name = "`is_login`")
    private Boolean isLogin;

    /**
     * 抽奖次数
     */
    @Column(name = "`winning_num`")
    private Integer winningNum;

    /**
     * 抽奖锁，0开放，1锁定
     */
    @Column(name = "`winning_lock`")
    private Boolean winningLock;

    /**
     * 推荐人
     */
    @Column(name = "`referrer`")
    private String referrer;

    /**
     * 二维码分享人
     */
    @Column(name = "`qr_share_name`")
    private String qrShareName;

    /**
     * 分享二维码图
     */
    @Column(name = "`qr_share_code`")
    private String qrShareCode;

    /**
     * 分享码
     */
    @Column(name = "`qr_invite_code`")
    private String qrInviteCode;

    /**
     * 新用户分享获得佣金
     */
    @Column(name = "`new_commission`")
    private BigDecimal newCommission;

    /**
     * 分享人
     */
    @Column(name = "`share_name`")
    private String shareName;

    /**
     * 猪肉券额度
     */
    @Column(name = "`pork_quota_money`")
    private BigDecimal porkQuotaMoney;

    /**
     * 广发员工
     */
    @Column(name = "`cgb_employees`")
    private BigDecimal cgbEmployees;

    /**
     * 推荐人key
     */
    @Column(name = "`referrer_key`")
    private String referrerKey;

    /**
     * 免费提现额度
     */
    @Column(name = "`new_free_money`")
    private BigDecimal newFreeMoney;

    private static final long serialVersionUID = 1L;

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取上一级ID
     *
     * @return fromuser_one - 上一级ID
     */
    public Integer getFromuserOne() {
        return fromuserOne;
    }

    /**
     * 设置上一级ID
     *
     * @param fromuserOne 上一级ID
     */
    public void setFromuserOne(Integer fromuserOne) {
        this.fromuserOne = fromuserOne;
    }

    /**
     * 获取上上级ID
     *
     * @return fromuser_two - 上上级ID
     */
    public Integer getFromuserTwo() {
        return fromuserTwo;
    }

    /**
     * 设置上上级ID
     *
     * @param fromuserTwo 上上级ID
     */
    public void setFromuserTwo(Integer fromuserTwo) {
        this.fromuserTwo = fromuserTwo;
    }

    /**
     * @return fromuser_three
     */
    public Integer getFromuserThree() {
        return fromuserThree;
    }

    /**
     * @param fromuserThree
     */
    public void setFromuserThree(Integer fromuserThree) {
        this.fromuserThree = fromuserThree;
    }

    /**
     * 获取邀请码
     *
     * @return invite_code - 邀请码
     */
    public String getInviteCode() {
        return inviteCode;
    }

    /**
     * 设置邀请码
     *
     * @param inviteCode 邀请码
     */
    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode == null ? null : inviteCode.trim();
    }

    /**
     * 获取二维码
     *
     * @return qrcode - 二维码
     */
    public String getQrcode() {
        return qrcode;
    }

    /**
     * 设置二维码
     *
     * @param qrcode 二维码
     */
    public void setQrcode(String qrcode) {
        this.qrcode = qrcode == null ? null : qrcode.trim();
    }

    /**
     * 获取邀请数
     *
     * @return Invitations - 邀请数
     */
    public Byte getInvitations() {
        return invitations;
    }

    /**
     * 设置邀请数
     *
     * @param invitations 邀请数
     */
    public void setInvitations(Byte invitations) {
        this.invitations = invitations;
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
     * 获取会员昵称
     *
     * @return user_nickname - 会员昵称
     */
    public String getUserNickname() {
        return userNickname;
    }

    /**
     * 设置会员昵称
     *
     * @param userNickname 会员昵称
     */
    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname == null ? null : userNickname.trim();
    }

    /**
     * 获取性别男0女1
     *
     * @return user_sex - 性别男0女1
     */
    public Byte getUserSex() {
        return userSex;
    }

    /**
     * 设置性别男0女1
     *
     * @param userSex 性别男0女1
     */
    public void setUserSex(Byte userSex) {
        this.userSex = userSex;
    }

    /**
     * 获取手机号
     *
     * @return user_phone - 手机号
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * 设置手机号
     *
     * @param userPhone 手机号
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    /**
     * 获取邮箱
     *
     * @return user_email - 邮箱
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * 设置邮箱
     *
     * @param userEmail 邮箱
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    /**
     * 获取用户头像
     *
     * @return user_photo - 用户头像
     */
    public String getUserPhoto() {
        return userPhoto;
    }

    /**
     * 设置用户头像
     *
     * @param userPhoto 用户头像
     */
    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto == null ? null : userPhoto.trim();
    }

    /**
     * 获取有效状态(0为无效 1为有效)
     *
     * @return user_effective - 有效状态(0为无效 1为有效)
     */
    public Byte getUserEffective() {
        return userEffective;
    }

    /**
     * 设置有效状态(0为无效 1为有效)
     *
     * @param userEffective 有效状态(0为无效 1为有效)
     */
    public void setUserEffective(Byte userEffective) {
        this.userEffective = userEffective;
    }

    /**
     * 获取激活状态（0为未激活 1为已激活）
     *
     * @return user_activation - 激活状态（0为未激活 1为已激活）
     */
    public Byte getUserActivation() {
        return userActivation;
    }

    /**
     * 设置激活状态（0为未激活 1为已激活）
     *
     * @param userActivation 激活状态（0为未激活 1为已激活）
     */
    public void setUserActivation(Byte userActivation) {
        this.userActivation = userActivation;
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
     * 获取上次登录时间
     *
     * @return last_time - 上次登录时间
     */
    public Integer getLastTime() {
        return lastTime;
    }

    /**
     * 设置上次登录时间
     *
     * @param lastTime 上次登录时间
     */
    public void setLastTime(Integer lastTime) {
        this.lastTime = lastTime;
    }

    /**
     * 获取最后登录时间
     *
     * @return end_time - 最后登录时间
     */
    public Integer getEndTime() {
        return endTime;
    }

    /**
     * 设置最后登录时间
     *
     * @param endTime 最后登录时间
     */
    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取用户来源
     *
     * @return user_from - 用户来源
     */
    public String getUserFrom() {
        return userFrom;
    }

    /**
     * 设置用户来源
     *
     * @param userFrom 用户来源
     */
    public void setUserFrom(String userFrom) {
        this.userFrom = userFrom == null ? null : userFrom.trim();
    }

    /**
     * 获取用户类型0普通用户，shopid值则是店铺用户。-1地推人员，-2公司内部人员
     *
     * @return user_type - 用户类型0普通用户，shopid值则是店铺用户。-1地推人员，-2公司内部人员
     */
    public Integer getUserType() {
        return userType;
    }

    /**
     * 设置用户类型0普通用户，shopid值则是店铺用户。-1地推人员，-2公司内部人员
     *
     * @param userType 用户类型0普通用户，shopid值则是店铺用户。-1地推人员，-2公司内部人员
     */
    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    /**
     * 获取用户积分
     *
     * @return user_score - 用户积分
     */
    public Integer getUserScore() {
        return userScore;
    }

    /**
     * 设置用户积分
     *
     * @param userScore 用户积分
     */
    public void setUserScore(Integer userScore) {
        this.userScore = userScore;
    }

    /**
     * 获取账户余额
     *
     * @return user_money - 账户余额
     */
    public BigDecimal getUserMoney() {
        return userMoney;
    }

    /**
     * 设置账户余额
     *
     * @param userMoney 账户余额
     */
    public void setUserMoney(BigDecimal userMoney) {
        this.userMoney = userMoney;
    }

    /**
     * 获取总资产
     *
     * @return total_assets - 总资产
     */
    public BigDecimal getTotalAssets() {
        return totalAssets;
    }

    /**
     * 设置总资产
     *
     * @param totalAssets 总资产
     */
    public void setTotalAssets(BigDecimal totalAssets) {
        this.totalAssets = totalAssets;
    }

    /**
     * 获取储值卡余额
     *
     * @return pet_card_money - 储值卡余额
     */
    public BigDecimal getPetCardMoney() {
        return petCardMoney;
    }

    /**
     * 设置储值卡余额
     *
     * @param petCardMoney 储值卡余额
     */
    public void setPetCardMoney(BigDecimal petCardMoney) {
        this.petCardMoney = petCardMoney;
    }

    /**
     * 获取福利卡余额
     *
     * @return welfare_card - 福利卡余额
     */
    public BigDecimal getWelfareCard() {
        return welfareCard;
    }

    /**
     * 设置福利卡余额
     *
     * @param welfareCard 福利卡余额
     */
    public void setWelfareCard(BigDecimal welfareCard) {
        this.welfareCard = welfareCard;
    }

    /**
     * 获取投资余额
     *
     * @return invest_money - 投资余额
     */
    public BigDecimal getInvestMoney() {
        return investMoney;
    }

    /**
     * 设置投资余额
     *
     * @param investMoney 投资余额
     */
    public void setInvestMoney(BigDecimal investMoney) {
        this.investMoney = investMoney;
    }

    /**
     * 获取老平台免息余额
     *
     * @return free_money - 老平台免息余额
     */
    public BigDecimal getFreeMoney() {
        return freeMoney;
    }

    /**
     * 设置老平台免息余额
     *
     * @param freeMoney 老平台免息余额
     */
    public void setFreeMoney(BigDecimal freeMoney) {
        this.freeMoney = freeMoney;
    }

    /**
     * 获取体验金账户
     *
     * @return ex_money - 体验金账户
     */
    public BigDecimal getExMoney() {
        return exMoney;
    }

    /**
     * 设置体验金账户
     *
     * @param exMoney 体验金账户
     */
    public void setExMoney(BigDecimal exMoney) {
        this.exMoney = exMoney;
    }

    /**
     * 获取open_id web端 微信的用户id
     *
     * @return open_id - open_id web端 微信的用户id
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * 设置open_id web端 微信的用户id
     *
     * @param openId open_id web端 微信的用户id
     */
    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    /**
     * 获取第三方来源（广告 百度 头条 等..)
     *
     * @return three_source - 第三方来源（广告 百度 头条 等..)
     */
    public String getThreeSource() {
        return threeSource;
    }

    /**
     * 设置第三方来源（广告 百度 头条 等..)
     *
     * @param threeSource 第三方来源（广告 百度 头条 等..)
     */
    public void setThreeSource(String threeSource) {
        this.threeSource = threeSource == null ? null : threeSource.trim();
    }

    /**
     * 获取0未删除 1已删除
     *
     * @return is_del - 0未删除 1已删除
     */
    public Byte getIsDel() {
        return isDel;
    }

    /**
     * 设置0未删除 1已删除
     *
     * @param isDel 0未删除 1已删除
     */
    public void setIsDel(Byte isDel) {
        this.isDel = isDel;
    }

    /**
     * 获取0为真实用户 1为测试用户
     *
     * @return is_test - 0为真实用户 1为测试用户
     */
    public Byte getIsTest() {
        return isTest;
    }

    /**
     * 设置0为真实用户 1为测试用户
     *
     * @param isTest 0为真实用户 1为测试用户
     */
    public void setIsTest(Byte isTest) {
        this.isTest = isTest;
    }

    /**
     * 获取pc端token
     *
     * @return pc_token - pc端token
     */
    public String getPcToken() {
        return pcToken;
    }

    /**
     * 设置pc端token
     *
     * @param pcToken pc端token
     */
    public void setPcToken(String pcToken) {
        this.pcToken = pcToken == null ? null : pcToken.trim();
    }

    /**
     * 获取wap端token
     *
     * @return wap_token - wap端token
     */
    public String getWapToken() {
        return wapToken;
    }

    /**
     * 设置wap端token
     *
     * @param wapToken wap端token
     */
    public void setWapToken(String wapToken) {
        this.wapToken = wapToken == null ? null : wapToken.trim();
    }

    /**
     * 获取安卓和ios端token
     *
     * @return app_token - 安卓和ios端token
     */
    public String getAppToken() {
        return appToken;
    }

    /**
     * 设置安卓和ios端token
     *
     * @param appToken 安卓和ios端token
     */
    public void setAppToken(String appToken) {
        this.appToken = appToken == null ? null : appToken.trim();
    }

    /**
     * 获取八戒王国pc端token
     *
     * @return bj_pc_token - 八戒王国pc端token
     */
    public String getBjPcToken() {
        return bjPcToken;
    }

    /**
     * 设置八戒王国pc端token
     *
     * @param bjPcToken 八戒王国pc端token
     */
    public void setBjPcToken(String bjPcToken) {
        this.bjPcToken = bjPcToken == null ? null : bjPcToken.trim();
    }

    /**
     * 获取八戒王国wap端token
     *
     * @return bj_wap_token - 八戒王国wap端token
     */
    public String getBjWapToken() {
        return bjWapToken;
    }

    /**
     * 设置八戒王国wap端token
     *
     * @param bjWapToken 八戒王国wap端token
     */
    public void setBjWapToken(String bjWapToken) {
        this.bjWapToken = bjWapToken == null ? null : bjWapToken.trim();
    }

    /**
     * 获取0 不是广发银行联名，1是广发银行联名
     *
     * @return is_cgb - 0 不是广发银行联名，1是广发银行联名
     */
    public Boolean getIsCgb() {
        return isCgb;
    }

    /**
     * 设置0 不是广发银行联名，1是广发银行联名
     *
     * @param isCgb 0 不是广发银行联名，1是广发银行联名
     */
    public void setIsCgb(Boolean isCgb) {
        this.isCgb = isCgb;
    }

    /**
     * 获取最后修改时间
     *
     * @return last_edit_time - 最后修改时间
     */
    public Integer getLastEditTime() {
        return lastEditTime;
    }

    /**
     * 设置最后修改时间
     *
     * @param lastEditTime 最后修改时间
     */
    public void setLastEditTime(Integer lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    /**
     * 获取佣金账户
     *
     * @return commission - 佣金账户
     */
    public BigDecimal getCommission() {
        return commission;
    }

    /**
     * 设置佣金账户
     *
     * @param commission 佣金账户
     */
    public void setCommission(BigDecimal commission) {
        this.commission = commission;
    }

    /**
     * 获取0未登录过，1已登录过
     *
     * @return is_login - 0未登录过，1已登录过
     */
    public Boolean getIsLogin() {
        return isLogin;
    }

    /**
     * 设置0未登录过，1已登录过
     *
     * @param isLogin 0未登录过，1已登录过
     */
    public void setIsLogin(Boolean isLogin) {
        this.isLogin = isLogin;
    }

    /**
     * 获取抽奖次数
     *
     * @return winning_num - 抽奖次数
     */
    public Integer getWinningNum() {
        return winningNum;
    }

    /**
     * 设置抽奖次数
     *
     * @param winningNum 抽奖次数
     */
    public void setWinningNum(Integer winningNum) {
        this.winningNum = winningNum;
    }

    /**
     * 获取抽奖锁，0开放，1锁定
     *
     * @return winning_lock - 抽奖锁，0开放，1锁定
     */
    public Boolean getWinningLock() {
        return winningLock;
    }

    /**
     * 设置抽奖锁，0开放，1锁定
     *
     * @param winningLock 抽奖锁，0开放，1锁定
     */
    public void setWinningLock(Boolean winningLock) {
        this.winningLock = winningLock;
    }

    /**
     * 获取推荐人
     *
     * @return referrer - 推荐人
     */
    public String getReferrer() {
        return referrer;
    }

    /**
     * 设置推荐人
     *
     * @param referrer 推荐人
     */
    public void setReferrer(String referrer) {
        this.referrer = referrer == null ? null : referrer.trim();
    }

    /**
     * 获取二维码分享人
     *
     * @return qr_share_name - 二维码分享人
     */
    public String getQrShareName() {
        return qrShareName;
    }

    /**
     * 设置二维码分享人
     *
     * @param qrShareName 二维码分享人
     */
    public void setQrShareName(String qrShareName) {
        this.qrShareName = qrShareName == null ? null : qrShareName.trim();
    }

    /**
     * 获取分享二维码图
     *
     * @return qr_share_code - 分享二维码图
     */
    public String getQrShareCode() {
        return qrShareCode;
    }

    /**
     * 设置分享二维码图
     *
     * @param qrShareCode 分享二维码图
     */
    public void setQrShareCode(String qrShareCode) {
        this.qrShareCode = qrShareCode == null ? null : qrShareCode.trim();
    }

    /**
     * 获取分享码
     *
     * @return qr_invite_code - 分享码
     */
    public String getQrInviteCode() {
        return qrInviteCode;
    }

    /**
     * 设置分享码
     *
     * @param qrInviteCode 分享码
     */
    public void setQrInviteCode(String qrInviteCode) {
        this.qrInviteCode = qrInviteCode == null ? null : qrInviteCode.trim();
    }

    /**
     * 获取新用户分享获得佣金
     *
     * @return new_commission - 新用户分享获得佣金
     */
    public BigDecimal getNewCommission() {
        return newCommission;
    }

    /**
     * 设置新用户分享获得佣金
     *
     * @param newCommission 新用户分享获得佣金
     */
    public void setNewCommission(BigDecimal newCommission) {
        this.newCommission = newCommission;
    }

    /**
     * 获取分享人
     *
     * @return share_name - 分享人
     */
    public String getShareName() {
        return shareName;
    }

    /**
     * 设置分享人
     *
     * @param shareName 分享人
     */
    public void setShareName(String shareName) {
        this.shareName = shareName == null ? null : shareName.trim();
    }

    /**
     * 获取猪肉券额度
     *
     * @return pork_quota_money - 猪肉券额度
     */
    public BigDecimal getPorkQuotaMoney() {
        return porkQuotaMoney;
    }

    /**
     * 设置猪肉券额度
     *
     * @param porkQuotaMoney 猪肉券额度
     */
    public void setPorkQuotaMoney(BigDecimal porkQuotaMoney) {
        this.porkQuotaMoney = porkQuotaMoney;
    }

    /**
     * 获取广发员工
     *
     * @return cgb_employees - 广发员工
     */
    public BigDecimal getCgbEmployees() {
        return cgbEmployees;
    }

    /**
     * 设置广发员工
     *
     * @param cgbEmployees 广发员工
     */
    public void setCgbEmployees(BigDecimal cgbEmployees) {
        this.cgbEmployees = cgbEmployees;
    }

    /**
     * 获取推荐人key
     *
     * @return referrer_key - 推荐人key
     */
    public String getReferrerKey() {
        return referrerKey;
    }

    /**
     * 设置推荐人key
     *
     * @param referrerKey 推荐人key
     */
    public void setReferrerKey(String referrerKey) {
        this.referrerKey = referrerKey == null ? null : referrerKey.trim();
    }

    /**
     * 获取免费提现额度
     *
     * @return new_free_money - 免费提现额度
     */
    public BigDecimal getNewFreeMoney() {
        return newFreeMoney;
    }

    /**
     * 设置免费提现额度
     *
     * @param newFreeMoney 免费提现额度
     */
    public void setNewFreeMoney(BigDecimal newFreeMoney) {
        this.newFreeMoney = newFreeMoney;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", fromuserOne=").append(fromuserOne);
        sb.append(", fromuserTwo=").append(fromuserTwo);
        sb.append(", fromuserThree=").append(fromuserThree);
        sb.append(", inviteCode=").append(inviteCode);
        sb.append(", qrcode=").append(qrcode);
        sb.append(", invitations=").append(invitations);
        sb.append(", loginName=").append(loginName);
        sb.append(", loginPwd=").append(loginPwd);
        sb.append(", userNickname=").append(userNickname);
        sb.append(", userSex=").append(userSex);
        sb.append(", userPhone=").append(userPhone);
        sb.append(", userEmail=").append(userEmail);
        sb.append(", userPhoto=").append(userPhoto);
        sb.append(", userEffective=").append(userEffective);
        sb.append(", userActivation=").append(userActivation);
        sb.append(", createTime=").append(createTime);
        sb.append(", lastIp=").append(lastIp);
        sb.append(", lastTime=").append(lastTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", userFrom=").append(userFrom);
        sb.append(", userType=").append(userType);
        sb.append(", userScore=").append(userScore);
        sb.append(", userMoney=").append(userMoney);
        sb.append(", totalAssets=").append(totalAssets);
        sb.append(", petCardMoney=").append(petCardMoney);
        sb.append(", welfareCard=").append(welfareCard);
        sb.append(", investMoney=").append(investMoney);
        sb.append(", freeMoney=").append(freeMoney);
        sb.append(", exMoney=").append(exMoney);
        sb.append(", openId=").append(openId);
        sb.append(", threeSource=").append(threeSource);
        sb.append(", isDel=").append(isDel);
        sb.append(", isTest=").append(isTest);
        sb.append(", pcToken=").append(pcToken);
        sb.append(", wapToken=").append(wapToken);
        sb.append(", appToken=").append(appToken);
        sb.append(", bjPcToken=").append(bjPcToken);
        sb.append(", bjWapToken=").append(bjWapToken);
        sb.append(", isCgb=").append(isCgb);
        sb.append(", lastEditTime=").append(lastEditTime);
        sb.append(", commission=").append(commission);
        sb.append(", isLogin=").append(isLogin);
        sb.append(", winningNum=").append(winningNum);
        sb.append(", winningLock=").append(winningLock);
        sb.append(", referrer=").append(referrer);
        sb.append(", qrShareName=").append(qrShareName);
        sb.append(", qrShareCode=").append(qrShareCode);
        sb.append(", qrInviteCode=").append(qrInviteCode);
        sb.append(", newCommission=").append(newCommission);
        sb.append(", shareName=").append(shareName);
        sb.append(", porkQuotaMoney=").append(porkQuotaMoney);
        sb.append(", cgbEmployees=").append(cgbEmployees);
        sb.append(", referrerKey=").append(referrerKey);
        sb.append(", newFreeMoney=").append(newFreeMoney);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}