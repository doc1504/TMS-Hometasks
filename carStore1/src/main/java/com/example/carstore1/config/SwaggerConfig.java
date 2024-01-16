package com.example.carstore1.config;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class SwaggerConfig {
    @Bean
    public GroupedOpenApi saveCarOpenApi() {
        String paths[] = {"/store/cars/**"};
        return GroupedOpenApi.builder().group("il-car-store").pathsToMatch(paths)
                .build();
    }
}
