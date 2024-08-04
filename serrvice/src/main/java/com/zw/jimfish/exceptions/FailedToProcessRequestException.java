package com.zw.jimfish.exceptions;

public class FailedToProcessRequestException extends RuntimeException {
    public FailedToProcessRequestException(String message) {
        super(message);
    }
}
