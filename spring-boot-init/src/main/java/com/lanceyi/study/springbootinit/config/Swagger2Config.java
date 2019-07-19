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
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any()).build().useDefaultResponseMessages(false);
    }

    /**
     * 获取swagger ApiInfo
     *
     * @return
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Web RESTful API")
                .version("1.0")
                .termsOfServiceUrl("https://www.lanceyi.com")
                .description("API 描述")
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