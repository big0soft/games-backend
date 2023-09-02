package com.big0soft.games.dto;

public class EmptyValueException extends CustomRuntimeException{

    public EmptyValueException(String message, int stateCode) {
        super(message, stateCode);
    }
}
