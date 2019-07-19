package com.siyuan.intplatform.web.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 黄树伟
 * \* Date: 2019-7-17
 * \* Time: 8:26
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@EnableSwagger2
@Configuration
public class SwaggerConfig {

    @Value("${swagger.docket.host}")
    private String host;

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .host(host)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.siyuan.intplatform.web.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("接口中心文档")
                .description("接口中心文档")
                .termsOfServiceUrl("*")
                .version("1.0")
                .termsOfServiceUrl("http://www.baidu.com")
                .build();
    }
}
