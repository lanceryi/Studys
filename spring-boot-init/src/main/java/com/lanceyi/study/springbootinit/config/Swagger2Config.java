package com.lanceyi.study.springbootinit.config;

import com.lanceyi.study.springbootinit.common.utils.JWTUtils;
import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;
import java.util.List;

@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .globalOperationParameters(getParameters())
                .apiInfo(apiInfo())
                .select()
//                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .apis(RequestHandlerSelectors.basePackage("com.lanceyi.study.springbootinit.controller"))
                .paths(PathSelectors.any())
                .build().useDefaultResponseMessages(false);
    }

    /**
     * 获取swagger ApiInfo
     *
     * @return
     */
    private ApiInfo apiInfo() {

        StringBuilder desc = new StringBuilder();
        desc.append("</br>");
        desc.append("<strong>主机说明：</strong></br>");
        desc.append("<ul>");
        desc.append("<li>测试地址：http://192.168.1.87:8080</li></br>");
        desc.append("<li>正式地址：http://xxx.api.com</li></br>");
        desc.append("</ul>");
        desc.append("</br>");
        desc.append("<strong>其他文档：</strong></br></br>");
        desc.append("</br>");
        desc.append("</br>");
        desc.append("<strong>全局返回说明：</strong></br></br>");
        desc.append("0：操作成功；小于0：系统错误； 大于0：业务错误 </br>");

        return new ApiInfoBuilder()
                .title("Web RESTful API")
                .version("1.0")
                .termsOfServiceUrl("https://www.lanceyi.com")
                .description(desc.toString())
                .contact(new Contact("Lanceyi", "https://www.lanceyi.com", "342003386@qq.com"))
                .build();
    }

    /**
     * 获取Swagger参数
     *
     * @return
     */
    List<Parameter> getParameters() {
        return Collections.singletonList(new ParameterBuilder()
                .name("Authorization")
                .defaultValue("Bearer " + JWTUtils.generate(1))
                .description("Authorization")
                .modelRef(new ModelRef("string"))
                .parameterType("header")
                .required(false)
                .build());
    }
}