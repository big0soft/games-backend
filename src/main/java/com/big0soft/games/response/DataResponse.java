package com.big0soft.games.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DataResponse<T> {
    private String message;
    private int responseCode;
    private boolean error;
    private T data;

    public DataResponse(T data) {
        this.data = data;
    }
}
