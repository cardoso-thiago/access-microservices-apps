package br.com.mastertech.door.exception;

import org.springframework.http.HttpStatus;

class DoorSystemException extends Exception {
    private HttpStatus httpStatus;

    DoorSystemException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }

    HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
