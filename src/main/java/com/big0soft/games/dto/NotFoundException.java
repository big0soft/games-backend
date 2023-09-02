package com.big0soft.games.dto;

public class NotFoundException extends CustomRuntimeException{
    public NotFoundException(String message, int stateCode) {
        super(message, stateCode);
    }
}
