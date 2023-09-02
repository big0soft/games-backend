package com.big0soft.games.config;

import com.big0soft.games.handle.ArabicResponseMessage;
import com.big0soft.games.handle.IResponseMessage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ResponseMessageConfig {
    @Bean
    public IResponseMessage arabicResponseMessage() {
        return new ArabicResponseMessage();
    }
}
