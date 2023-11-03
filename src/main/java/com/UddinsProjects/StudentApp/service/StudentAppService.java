package com.UddinsProjects.StudentApp.service;

import com.UddinsProjects.StudentApp.entity.StudentApp;

import java.util.List;

public interface StudentAppService {
    public void createData(StudentApp studentApp);
    public void updateData(StudentApp studentApp);
    public StudentApp getData(Long id);
    public List<StudentApp> getAllData();
    public void deleteData(Long id);

}
