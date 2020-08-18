package br.com.mastertech.access.exception;

import org.springframework.http.HttpStatus;

class AccessSystemException extends Exception {
    private HttpStatus httpStatus;

    AccessSystemException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }

    HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
