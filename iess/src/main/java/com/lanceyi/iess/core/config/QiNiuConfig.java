package com.lanceyi.iess.core.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * 七牛云配置
 *
 * @author Lance YI
 * @create 2019-1-8 10:44
 **/
@Data
@Configuration
@ConfigurationProperties(prefix = "qiniu")
public class QiNiuConfig {
    private String accessKey;
    private String secretKey;
    private String bucket;
    private String path;
    private long expireInSeconds;
    // 上传前缀
    private String prefix = "upload";
}