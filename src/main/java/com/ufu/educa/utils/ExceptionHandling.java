package com.ufu.educa.utils;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ExceptionHandling extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public ExceptionHandling() {
            super();
        }

    public ExceptionHandling(String message, Throwable cause) {
            super(message, cause);
        }

    public ExceptionHandling(String message) {
            super(message);
        }

    public ExceptionHandling(Throwable cause) {
            super(cause);
        }
}
