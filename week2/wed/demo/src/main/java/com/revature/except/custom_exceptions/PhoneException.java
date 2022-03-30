package com.revature.except.custom_exceptions;

public class PhoneException extends RuntimeException {
    public PhoneException() {
        System.out.println("Invalid phone #!");
    }

    public PhoneException(String message) {
        super(message);
    }

    public PhoneException(String message, Throwable cause) {
        super(message, cause);
    }

    public PhoneException(Throwable cause) {
        super(cause);
    }

    public PhoneException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
