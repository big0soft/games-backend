package com.big0soft.games.dto;

import com.big0soft.games.model.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class UserDto {
    private final String username;
    private final String password;
    private final String email;
    private final String uid;

    public UserDto(UserEntity user) {
        this.username = user.getUsername();
        this.password = user.getPassword();
        this.email = user.getEmail();
        this.uid = user.getUid();
    }
}
