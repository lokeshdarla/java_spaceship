package org.lokeshdarla.blogapp.Controllers;

import lombok.RequiredArgsConstructor;
import org.lokeshdarla.blogapp.Services.AuthenticationService;
import org.lokeshdarla.blogapp.Services.UserService;
import org.lokeshdarla.blogapp.dtos.AuthResponse;
import org.lokeshdarla.blogapp.dtos.LoginRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthenticationService authenticationService;

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest loginRequest) {
        UserDetails userDetails= authenticationService.authenticate(
                loginRequest.getUsername(),
                loginRequest.getPassword()
        );
        String token= authenticationService.generateToken(userDetails);
        AuthResponse authResponse = AuthResponse.builder()
                .token(token)
                .expiresIn(86400)
                .build();

        return ResponseEntity.ok(authResponse);
    }


}
