package com.itcast.demo;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

/**
 * @author wendongchao
 * @ClassName Handle
 * @Date 2021/5/29 17:44
 */
@Component
public class Handle {
    public static Mono<ServerResponse> hello(ServerRequest request){
        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(BodyInserters.fromObject("hello,this is a spring boot webflux project !"));
    }
}
