package br.com.mastertech.access.exception;

import org.springframework.http.HttpStatus;

public class AccessNotFoundException extends AccessSystemException {
    public AccessNotFoundException(String message) {
        super(message, HttpStatus.NOT_FOUND);
    }
}
