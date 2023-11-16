package ru.sakhapov.spring_jwt_auth.api.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class TokenNotFoundException extends RuntimeException{
    public TokenNotFoundException(String msg){
        super(msg);
    }
}
