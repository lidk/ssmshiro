package com.sunway.webcore.tools;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
 
/**
 * @author lxk on 2017/12/18
 */
@Configuration
@EnableSwagger2
@EnableWebMvc
public class SwaggerApi {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }
 
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("第一行业网页样版")
                .description("swagger2方便前后端分离开发")
                .termsOfServiceUrl("")
                .contact(new Contact("第一行业", "配置说明 ：https://blog.csdn.net/qq_28009065/article/details/79104103", ""))
                .license("")
                .licenseUrl("")
                .version("1.0.0")
                .build();
    }
 
}
