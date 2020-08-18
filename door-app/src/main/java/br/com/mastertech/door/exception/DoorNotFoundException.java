package br.com.mastertech.door.exception;

import org.springframework.http.HttpStatus;

public class DoorNotFoundException extends DoorSystemException {
    public DoorNotFoundException(String message) {
        super(message, HttpStatus.NOT_FOUND);
    }
}
