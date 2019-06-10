package com.stackroute.muzix.exception;

public class IdNotFoundException extends Exception {
    private  String message;
    public IdNotFoundException() {
    }
    public IdNotFoundException(String message)
    {
        super(message);
        this.message = message;
    }
}
