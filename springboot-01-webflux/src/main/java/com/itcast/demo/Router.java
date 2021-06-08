package com.itcast.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

/**
 * @author wendongchao
 * @ClassName Router
 * @Date 2021/5/29 17:49
 */
@Configuration
public class Router {
    @Bean
    public RouterFunction<ServerResponse> route(Handle handle){
        return RouterFunctions
                .route(RequestPredicates.GET("/hello")
                .and(RequestPredicates.accept(MediaType.APPLICATION_JSON)),Handle::hello);

    }
}
