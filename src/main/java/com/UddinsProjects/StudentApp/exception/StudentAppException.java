package com.UddinsProjects.StudentApp.exception;

import org.springframework.http.HttpStatus;

public class StudentAppException {
    private final String massage;
    private final Throwable throwable;
    private final HttpStatus httpStatus;

    public StudentAppException(String massage, Throwable throwable, HttpStatus httpStatus) {
        this.massage = massage;
        this.throwable = throwable;
        this.httpStatus = httpStatus;
    }

    public String getMassage() {
        return massage;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
