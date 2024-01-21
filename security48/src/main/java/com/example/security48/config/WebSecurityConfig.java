package com.example.security48.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
@Configuration
public class WebSecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain (HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(cust->{
            cust
                    .requestMatchers("/public", "/register", "/login", "/logout", "/goodbye").permitAll()
                    .requestMatchers("/private").authenticated()
                    .requestMatchers("/user").hasRole("USER")
                    .requestMatchers("/admin").hasRole("ADMIN");
        });

        http.formLogin(cust->{
            cust.loginPage("/public");
            cust.loginProcessingUrl("/login");
            cust.successHandler((request, response, authentication) -> {
                response.sendRedirect("/user");
            });
            cust.failureHandler((request, response, exception) -> {
                response.sendRedirect("/public");
            });
        });

        http.logout(cust-> {
            cust.logoutUrl("/logout");
            cust.logoutSuccessUrl("/goodbye");
            cust.invalidateHttpSession(true);
        });

        http.cors(AbstractHttpConfigurer::disable);
        http.csrf(AbstractHttpConfigurer::disable);
        http.httpBasic(Customizer.withDefaults());
        return http.build();
    }
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
