package com.UddinsProjects.StudentApp.exception;

public class StudentAppNotFoundException extends RuntimeException{
    public StudentAppNotFoundException(String message) {
        super(message);
    }

    public StudentAppNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
