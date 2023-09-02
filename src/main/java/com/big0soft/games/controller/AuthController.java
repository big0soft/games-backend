package com.big0soft.games.controller;

import com.big0soft.games.dto.UserDto;
import com.big0soft.games.model.UserEntity;
import com.big0soft.games.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {
    private final UserService userRepository;

    @PostMapping(
            value = "/login"
    )
    public Map<String,UserDto> login(@RequestBody UserEntity user,@RequestParam String provider) {
        Map<String, UserDto> map = new HashMap<>();
        map.put("data", userRepository.login(user));
        return map;
    }

    @PostMapping(
            value = "/register"
    )
    public Map<String,UserDto> registerUser(@RequestBody UserEntity user) {
        Map<String, UserDto> map = new HashMap<>();
        map.put("data", userRepository.registerUser(user));
        return map;
    }
    @GetMapping(
            value = "/test"
    )
    public String test() {
        return  "test";
    }

}
