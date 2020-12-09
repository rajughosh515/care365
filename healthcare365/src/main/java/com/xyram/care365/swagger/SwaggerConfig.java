package com.xyram.care365.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.google.common.base.Predicate;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.Contact;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static com.google.common.base.Predicates.or;

	@Configuration
	@EnableSwagger2
	public class SwaggerConfig {

		
		
		/*
		 * @Bean public Docket postsApi() { return new
		 * Docket(DocumentationType.SWAGGER_2).groupName("public-api")
		 * .apiInfo(apiInfo()).select().paths(postPaths()).build(); }
		 */
		 
		// Enable this for Security care api
		
		 @Bean public Docket api() { return new Docket(DocumentationType.SWAGGER_2)
		 .apiInfo(apiInfo()) .securityContexts(Arrays.asList(securityContext()))
		 .securitySchemes(Arrays.asList(apiKey())) .select()
		 .apis(RequestHandlerSelectors.any()) .paths(PathSelectors.any()) .build(); }
		
		 
		/*
		 * @Bean public Docket api() { return new Docket(DocumentationType.SWAGGER_2)
		 * .apiInfo(apiInfo()) .securityContexts(Arrays.asList(securityContext()))
		 * .securitySchemes(Arrays.asList(apiKey())) .select()
		 * .apis(RequestHandlerSelectors.any()) .paths(PathSelectors.any()) .build(); }
		 */
		private Predicate<String> postPaths() {
			return or(regex("/api/posts.*"), regex("/api/v1.*"));
		}		
		/*
		 * private ApiInfo apiInfo() { return new
		 * ApiInfo("Test","Test","Test","Test","Test","Test","Test"); }
		 */
		
		private ApiInfo apiInfo() {
		    return new ApiInfo(
		      "My REST API",
		      "Some custom description of API.",
		      "1.0",
		      "Terms of service",		      
		      new Contact("Raju Ghosh", "test", "raju.ghosh@xyramsoft.com"),
		      "License of API",
		      "API license URL");
		}
		
		
		 private ApiKey apiKey() { return new ApiKey("JWT", "Authorization",
		  "header"); }
		  
		  private SecurityContext securityContext() { return
		  SecurityContext.builder().securityReferences(defaultAuth()).build(); }
		  
		  private List<SecurityReference> defaultAuth() { AuthorizationScope
		  authorizationScope = new AuthorizationScope("global", "accessEverything");
		  AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
		  authorizationScopes[0] = authorizationScope; return Arrays.asList(new
		  SecurityReference("JWT", authorizationScopes)); }
		 

	}