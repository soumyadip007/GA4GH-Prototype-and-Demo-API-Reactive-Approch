package com.ga4gh.reactive.prototype.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicate;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;


@Configuration
public class ReactiveConfig {

	@Bean
	RouterFunction<?> routerFunction(Route){
		
		RouterFunctions.route(RequestPredicate.GET("/ga4gh/flux")
				
				)
		
	}
}