package com.ecomarket.auth_service.controller;

import com.ecomarket.auth_service.DTO.UserDTO;
import com.ecomarket.auth_service.DTO.UserRegisterRequest;
import com.ecomarket.auth_service.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<UserDTO> register(@Valid @RequestBody UserRegisterRequest request) {
        UserDTO user = userService.registerUser(request);
        return ResponseEntity.ok(user);
    }
}
