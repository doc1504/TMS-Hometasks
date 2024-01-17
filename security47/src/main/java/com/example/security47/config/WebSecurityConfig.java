package com.example.security47.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
@Configuration
public class WebSecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain (HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeHttpRequests(cust -> {
            cust
                    .requestMatchers("/public").permitAll()
                    .requestMatchers("/private").authenticated()
                    .requestMatchers("/access").hasAuthority("access");
        });
       httpSecurity.httpBasic(Customizer.withDefaults());
       return httpSecurity.build();
    }
    @Bean
    public UserDetailsManager userDetailsManager() {
        UserDetails person1 = User.builder()
                .username("IVANOV")
                .password("pass1")
                .build();
        UserDetails person2 = User.builder()
                .username("PETROV")
                .password("pass2")
                .build();
        UserDetails person3 = User.builder()
                .username("SIDOROV")
                .password("pass3")
                .authorities("access")
                .build();
        return new InMemoryUserDetailsManager(person1, person2, person3);
    }
    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }
}


