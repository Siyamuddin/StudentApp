package com.UddinsProjects.StudentApp.controller;

import com.UddinsProjects.StudentApp.Response.StudentResponse;
import com.UddinsProjects.StudentApp.entity.StudentApp;
import com.UddinsProjects.StudentApp.service.StudentAppService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/studentinfo")
public class StudentAppController {
    StudentAppService studentAppService;

    public StudentAppController(StudentAppService studentAppService) {
        this.studentAppService = studentAppService;
    }
    @PostMapping
    public String createData(@RequestBody StudentApp studentApp)
    {
        studentAppService.createData(studentApp);
        return "New data created";
    }
    @PutMapping
    public String updateData(@RequestBody StudentApp studentApp)
    {
        studentAppService.updateData(studentApp);
        return "Data updated successfully.";
    }
    @GetMapping("{id}")
    public ResponseEntity<Object> getData(@PathVariable("id") Long id)
    {
        return StudentResponse.responseBuilder("The request found.", HttpStatus.OK, studentAppService.getData(id));

    }
    @GetMapping("/all")
    public List<StudentApp> getAllData()
    {
        return studentAppService.getAllData();
    }
    @DeleteMapping("{id}")
    public String deleteData(@PathVariable("id") Long id)
    {
        studentAppService.deleteData(id);
        return "Data has been deleted successfully";
    }

}
