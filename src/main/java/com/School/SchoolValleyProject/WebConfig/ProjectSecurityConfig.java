package com.School.SchoolValleyProject.WebConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
    public class ProjectSecurityConfig  {

        @Bean
        SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {

            http.csrf().ignoringRequestMatchers("/saveMsg").ignoringRequestMatchers("/public/**")
                    .ignoringRequestMatchers("/api/**").ignoringRequestMatchers("/data-api/**")
                    .ignoringRequestMatchers("/valleyschool/actuator/**").and()
                    .authorizeHttpRequests()
                    .requestMatchers("/dashboard").authenticated()
                    .requestMatchers("/displayMessages/**").hasRole("ADMIN")
                    .requestMatchers("/valleyschool/actuator/**").hasRole("ADMIN")
                    .requestMatchers("/closeMsg/**").hasRole("ADMIN")
                    .requestMatchers("/admin/**").hasRole("ADMIN")
                    .requestMatchers("/api/**").authenticated()
                    .requestMatchers("/data-api/**").authenticated()
                    .requestMatchers("/displayProfile").authenticated()
                    .requestMatchers("/updateProfile").authenticated()
                    .requestMatchers("/student/**").hasRole("STUDENT")
                    .requestMatchers("","/","/home/**").permitAll()
                    .requestMatchers("/holidays/**").permitAll()
                    .requestMatchers("/contact").permitAll()
                    .requestMatchers("/saveMsg").permitAll()
                    .requestMatchers("/courses").permitAll()
                    .requestMatchers("/about").permitAll()
                    .requestMatchers("/linkedin").permitAll()
                    .requestMatchers("/login").permitAll()
                    .requestMatchers("/logout").permitAll()
                    .requestMatchers("/error").permitAll()
                    .requestMatchers("/assets/**").permitAll()
                    .requestMatchers("/public/**").permitAll()
                    .and().formLogin().loginPage("/login")
                    .defaultSuccessUrl("/dashboard").failureUrl("/login?error=true").permitAll()
                    .and().logout().logoutSuccessUrl("/login?logout=true").invalidateHttpSession(true).permitAll()
                    .and().httpBasic();

            return http.build();
        }

    @Bean
    public PasswordEncoder passwordEncoder()
    {
        return new BCryptPasswordEncoder();
    }

//    @Bean
//    public BasicAuthenticationInterceptor basicAuthenticationInterceptor()
//    {
//        return new BasicAuthenticationInterceptor("admin@valleyschool.com","admin");
//    }

}
