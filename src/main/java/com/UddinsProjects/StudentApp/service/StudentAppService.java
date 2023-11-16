package com.UddinsProjects.StudentApp.service;

import com.UddinsProjects.StudentApp.entity.StudentApp;

import java.util.List;

public interface StudentAppService {
    public String createData(StudentApp studentApp);
    public String updateData(StudentApp studentApp);
    public StudentApp getData(Long id);
    public List<StudentApp> getAllData();
    public String deleteData(Long id);

}
