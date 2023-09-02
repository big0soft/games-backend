package com.big0soft.games.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

public record CustomErrorResponse(
        LocalDateTime timestamp,
       @JsonProperty(value = "state_code") int status,
        boolean isError,
        String error,
        String message
) {

}
