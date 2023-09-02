package com.big0soft.games.dto;

public class UsernameExistsException extends CustomRuntimeException{
    public UsernameExistsException(String message, int stateCode) {
        super(message, stateCode);
    }
}
