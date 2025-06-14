package com.ecomarket.auth_service.exception;

public class EmailAlreadyExistsException extends RuntimeException {
    public EmailAlreadyExistsException(String email) {
        super("El correo ya está registrado: " + email);
    }
}
