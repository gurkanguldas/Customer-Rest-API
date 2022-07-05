package com.gurkanguldas.CustomerRestApi.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
@SecurityScheme(name = "bearerAuth", type = SecuritySchemeType.HTTP, bearerFormat = "JWT", scheme = "bearer")
public class SwaggerConfigurationBean {
	@Bean
	public OpenAPI openApi() {
		return new OpenAPI().info(new Info().title("Customer Service").description("Customer Rest API").version("v1.0")
				.contact(new Contact().name("[Bekir Gurkan Guldas]").email("gurkanguldas@gmail.com"))
				.license(new License().name("License").url("http://www.apache.org/licenses/LICENSE-2.0.html")));
	}

}