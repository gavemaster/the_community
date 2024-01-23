package com.woah.community.authentication;


import com.woah.community.user.User;
import com.woah.community.user.UserRepository;
import com.woah.community.utils.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

    private final UserRepository userRepo;
    private final JwtService jwtService;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authManager;
    public AuthenticationResponse register(RegisterForm registerForm){
        var user = User.builder()
                .firstName(registerForm.getFirstName())
                .lastName(registerForm.getLastName())
                .email(registerForm.getEmail())
                .phoneNumber(registerForm.getPhoneNumber())
                .password(passwordEncoder.encode(registerForm.getPassword()))
                .roles("ROLE_USER")
                .createdAt(new Date())
                .inactiveFlag("N")
                .lastLogin(new Date())
                .build();
        userRepo.save(user);
        var jwtToken = jwtService.generateToken(new SecurityUser(user));

        return AuthenticationResponse.builder().token(jwtToken).build();

    }

    public AuthenticationResponse authenticate(AuthenticationForm authForm){
        authManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        authForm.getUsername(),
                        authForm.getPassword()
                )
        );
        var user = userRepo.findByUsername(authForm.getUsername())
                .orElseThrow();
        var jwtToken = jwtService.generateToken(new SecurityUser(user));
        return AuthenticationResponse.builder().token(jwtToken).build();

    }
}
