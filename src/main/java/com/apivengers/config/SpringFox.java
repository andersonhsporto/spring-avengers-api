package com.apivengers.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SpringFox {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.apivengers.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo metaInfo() {
        ApiInfo apiInfo = new ApiInfo(
                "Avengers API",
                "A simple restful api to get some information about the avengers.",
                "1.0",
                "https://github.com/andersonhsporto/spring-avengers-api",
                new Contact("Anderson Porto",
                        "https://github.com/andersonhsporto/spring-avengers-api",
                        "anderson.higo2@gmail.com"),
                        "MIT LICENSE",
                        "https://github.com/andersonhsporto/spring-avengers-api/blob/master/LICENSE",
                new ArrayList<VendorExtension>()
        );
        return apiInfo;
    }
}
