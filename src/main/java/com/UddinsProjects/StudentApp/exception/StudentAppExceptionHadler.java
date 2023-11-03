package com.UddinsProjects.StudentApp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class StudentAppExceptionHadler {

    @ExceptionHandler(value = {StudentAppNotFoundException.class})
    public ResponseEntity<Object> handleStudentAppException(StudentAppNotFoundException studentAppNotFoundException)
    {
        StudentAppException studentAppException=new StudentAppException(studentAppNotFoundException.getMessage(),studentAppNotFoundException.getCause(), HttpStatus.NOT_FOUND);

        return new ResponseEntity<>(studentAppException,HttpStatus.NOT_FOUND);
    }
}
