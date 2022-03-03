package uz.pdp.pdpfoodapp.configs.swagger;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

/**
 * @configuration Swagger General Configurations
 */

@Configuration
@EnableSwagger2
public class SwaggerConfigurer {

    @Bean
    public Docket Api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("uz.pdp.pdpfoodapp.controller"))
                .paths(PathSelectors.regex("/api/.*"))
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Mushkityorlar",
                "Documentation of all APIs used in this project.",
                "API",
                "https://pdp.uz\n",
                new Contact("Mushkityorlar", "https://Mushkityorlar.uz\n", "Mushkityorlar@gmail.com"),
                "PDP", "pdp.uz", Collections.emptyList());
    }
}
