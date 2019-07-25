package com.lanceyi.iess.core.config;

/**
 * @author Lance YI
 * @date 2019/1/2 15:19
 */
public class WechatConstans {
    // 公众号ID
    public final static String appId = "wxfe772ab75c4d396a";
    // 公众号密钥
    public final static String secret = "0cc783c5082d04d03471b00708ed8349";
    // 商户号
    public final static String mchId = "";
    // 支付签名（商户平台设置的密钥key)
    public final static String paySignKey = "";
    // 交易类型
    public final static String tradeType = "JSAPI";
    // 证书名称，对应不同的商户号
    public final static String certName = "/cert/apiclient_cert.p12";
    // 支付回调地址
    public final static String notifyUrl = "https://www.fly2you.cn/admin/url/api/notify";
    // 获取code的请求地址
    public final static String getCode = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=%s&redirect_uri=%s&response_type=code&scope=%s&state=STAT#wechat_redirect";
    // 获取Web_access_tokenhttps的请求地址
    public final static String webAccessTokenhttps = "https://api.weixin.qq.com/sns/jscode2session?appid=%s&secret=%s&js_code=%s&grant_type=authorization_code";
    // 拉取用户信息的请求地址
    public final static String userMessage = "https://api.weixin.qq.com/sns/userinfo?access_token=%s&openid=%s&lang=zh_CN";
    // 微信统一下单接口路径
    public final static String uniformorder = "https://api.mch.weixin.qq.com/pay/unifiedorder";
    // 退款地址
    public final static String refundUrl = "https://api.mch.weixin.qq.com/secapi/pay/refund";
    // 退款查询地址
    public final static String refundqueryUrl = "https://api.mch.weixin.qq.com/pay/refundquery";
    // 微信查询订单状态
    public final static String orderquery = "https://api.mch.weixin.qq.com/pay/orderquery";
}
