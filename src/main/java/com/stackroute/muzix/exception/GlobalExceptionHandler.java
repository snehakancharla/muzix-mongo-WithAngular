package com.stackroute.muzix.exception;

//import com.stackroute.muzix.exception.IdNotFoundException;
//import com.stackroute.muzix.exception.TrackAlreadyExistsException;
//import com.stackroute.muzix.exception.TrackNotFoundException;
//import lombok.extern.java.Log;
//import lombok.extern.log4j.Log4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice

public class GlobalExceptionHandler {
    @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "track already exists")
    @ExceptionHandler(TrackAlreadyExistsException.class)
    public void handleEmptyFieldException(TrackAlreadyExistsException e)
    {
        System.out.println(" Track already exists");
    }
    @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Track not found")
    @ExceptionHandler(TrackNotFoundException.class)
    public void handleEmptyFieldException(TrackNotFoundException e)
    {
        System.out.println(" Track is not present to delete");
    }
    @ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Id is not present to update")
    @ExceptionHandler(IdNotFoundException.class)
    public void handleEmptyFieldException(IdNotFoundException e)
    {
        System.out.println(" Id is not present to delete");
    }
}
