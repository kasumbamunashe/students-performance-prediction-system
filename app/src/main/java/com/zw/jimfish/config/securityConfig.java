package com.zw.jimfish.config;
//
//import io.grpc.netty.shaded.io.netty.handler.codec.http.HttpMethod;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
public class securityConfig {
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http
//                .cors()
//                .and()
//                .csrf()
//                .disable()
//                .authorizeRequests()
//                .requestMatchers(request -> request.getMethod().equals(HttpMethod.GET.name()) && request.getRequestURI().equals("/send-email"))
//                .permitAll()
//                .requestMatchers(request -> request.getMethod().equals(HttpMethod.POST.name()) && request.getRequestURI().equals("/api/secure-endpoint"))
//                .hasAuthority("SCOPE_write")
////                .requestMatchers("/notifications")
//                .authenticated()
//                .anyRequest()
//                .denyAll()
//                .and()
//                .oauth2ResourceServer()
//                .jwt();
//        return null;
//    }
}
