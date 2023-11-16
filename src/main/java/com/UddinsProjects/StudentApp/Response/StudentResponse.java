package com.UddinsProjects.StudentApp.Response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class StudentResponse {
    public static ResponseEntity responseBuilder(String massage, HttpStatus httpStatus, Object responseObject)
    {
        Map<String, Object> response=new HashMap<>();

        response.put("Massage :",massage);
        response.put("HttpStatus :",httpStatus);
        response.put("Data :",responseObject);

        return new ResponseEntity<>(response,httpStatus);
    }
}
