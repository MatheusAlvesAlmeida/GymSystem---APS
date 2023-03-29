package com.controllers;

import java.util.Map;
import org.springframework.cloud.client.circuitbreaker.ReactiveCircuitBreaker;
import org.springframework.cloud.client.circuitbreaker.ReactiveCircuitBreakerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

public class AccountAPI {

    private final WebClient webClient;
    private final ReactiveCircuitBreaker circuitBreaker;

    public AccountServiceApi(WebClient.Builder wBuilder, ReactiveCircuitBreakerFactory cbFactory) {
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
