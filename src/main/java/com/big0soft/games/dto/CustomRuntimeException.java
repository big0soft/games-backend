package com.big0soft.games.dto;

public class CustomRuntimeException extends RuntimeException{
    private final int stateCode;

    public CustomRuntimeException(String message, int stateCode) {
        super(message);
        this.stateCode = stateCode;
    }

    public int getStateCode() {
        return stateCode;
    }
}
