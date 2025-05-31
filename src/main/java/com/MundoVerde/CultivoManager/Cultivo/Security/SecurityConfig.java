package com.MundoVerde.CultivoManager.Cultivo.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.SecurityFilterChain;
// import com.MundoVerde.CultivoManager.Cultivo.service.CustomUserDetailsService;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf().disable()
            .authorizeHttpRequests(auth -> auth
                .anyRequest().permitAll() 
            )
            .formLogin().disable();

        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}








//Para la implementacion de un front proximamente
// @Configuration
// public class SecurityConfig {

//     private final CustomUserDetailsService customUserDetailsService;

//     public SecurityConfig(CustomUserDetailsService customUserDetailsService) {
//         this.customUserDetailsService = customUserDetailsService;
//     }

//     @Bean
//     public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//         http
//             .csrf().disable()
//             .authorizeHttpRequests(auth -> auth
//                 .requestMatchers("").permitAll() // Rutas públicas
//                 .anyRequest().authenticated()
//             )
//             .formLogin(form -> form
//                 .loginPage("/login").permitAll()
//             )
//             .logout(logout -> logout.permitAll());

//         return http.build();
//     }

//     @Bean
//     public UserDetailsService userDetailsService() {
//         return customUserDetailsService;
//     }

//     @Bean
//     public PasswordEncoder passwordEncoder() {
//         return new BCryptPasswordEncoder();
//     }
// }
