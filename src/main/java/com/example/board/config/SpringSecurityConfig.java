package com.example.board.config;


//@Configuration
public class SpringSecurityConfig {

   /* @Bean
    public SecurityFilterChain filterChain(HttpSecurity http){
        http.csrf().disable().cors().disable()
                .authorizeHttpRequests(request -> request
                        .dispatcherTypeMatchers(DispatcherType.FORWARD).permitAll()
                        .anyRequest().authenticated()
                )
                .formLogin(login -> login
                        .defaultSuccessUrl("/",true)
                        .permitAll()
                )
                .logout(Customizer.withDefaults());

        return http.build();
    }
    */
}
