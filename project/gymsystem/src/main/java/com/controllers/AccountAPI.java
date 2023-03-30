package com.controllers;

import java.util.Map;
import org.springframework.cloud.client.circuitbreaker.ReactiveCircuitBreaker;
import org.springframework.cloud.client.circuitbreaker.ReactiveCircuitBreakerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;


import reactor.core.publisher.Mono;

@Component
public class AccountAPI {

    private WebClient webClient;
    private ReactiveCircuitBreaker circuitBreaker;

    public void AccountServiceApi(WebClient.Builder wBuilder, ReactiveCircuitBreakerFactory cbFactory) {
        this.webClient = wBuilder.baseUrl("lb://account").build();
        this.circuitBreaker = cbFactory.create("account");
    }

    // Login method
    public Mono<Map> login(String cpf, String password) {
        return circuitBreaker.run(
                webClient.post()
                        .uri("/account/login")
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(BodyInserters.fromFormData("cpf", cpf)
                                .with("password", password))
                        .retrieve()
                        .bodyToMono(Map.class),
                throwable -> Mono.empty());
    }

}
