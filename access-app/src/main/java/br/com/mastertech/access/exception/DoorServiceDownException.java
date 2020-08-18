package br.com.mastertech.access.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.SERVICE_UNAVAILABLE, reason = "O serviço de consulta de portas está temporariamente indisponível.")
public class DoorServiceDownException extends RuntimeException {
}