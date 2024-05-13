package com.solution.gestion_tache.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class SecurityConfig {
    @Bean
    BCryptPasswordEncoder bCryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }




 /*@Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
         httpSecurity.formLogin(Customizer.withDefaults());
         return httpSecurity.build();
    }*/

    @Bean
    public SecurityFilterChain SecurityFilterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
              //  .formLogin(Customizer.withDefaults())
                .httpBasic(Customizer.withDefaults())
                .authorizeHttpRequests(
                        authCustomizer -> authCustomizer
                                .requestMatchers("/deleteUser","updateprojet","saveUser","createUtilisateur","createprojet","saveProjet","deleteprojet","EditProjet").hasRole("Chef de projet")
                                .requestMatchers("/membreequipe","listprojet","updatetache","listtache","createtache","deleteTache","saveTache","EditTache").hasAnyRole("Chef de projet","Developpeur")
                                .requestMatchers("/login","/webjars/**").permitAll()
                             //   .requestMatchers("/membreequipe").hasAnyRole("Chef","DEV")
                                .anyRequest().authenticated()

                )
                .formLogin(
                        formLogin -> formLogin
                                .loginPage("/login")
                                .defaultSuccessUrl("/")
                )
                .exceptionHandling(e->e.accessDeniedPage("/accessDenied"))
                .build();
    }

    //@Bean
    public InMemoryUserDetailsManager inMemoryUserDetailsManager(){
        return new InMemoryUserDetailsManager(
                User.withUsername("Chef de projet").password(bCryptPasswordEncoder().encode("123")).roles("Chef de projet").build(),
                User.withUsername("Developpeur").password(bCryptPasswordEncoder().encode("123")).roles("Developpeur").build()


        );
    }

}
