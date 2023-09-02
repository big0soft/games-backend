package com.big0soft.games.dto;

public class EmailExistsException extends CustomRuntimeException {
    public EmailExistsException(String message, int stateCode) {
        super(message, stateCode);
    }
}
