package com.UddinsProjects.StudentApp.service;

import com.UddinsProjects.StudentApp.entity.StudentApp;
import com.UddinsProjects.StudentApp.exception.StudentAppNotFoundException;
import com.UddinsProjects.StudentApp.repository.StudentAppRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentAppServiceImplement implements StudentAppService{
    StudentAppRepository studentAppRepository;

    public StudentAppServiceImplement(StudentAppRepository studentAppRepository) {
        this.studentAppRepository = studentAppRepository;
    }

    public void createData(StudentApp studentApp)
    {
        studentAppRepository.save(studentApp);
    }
    public void updateData(StudentApp studentApp)
    {
        studentAppRepository.save(studentApp);
    }
    public StudentApp getData(Long id)
    {
        if(studentAppRepository.findById(id).isEmpty())
        {
            throw new StudentAppNotFoundException("The given ID("+id+") is not available at the moment.");
        }
        return studentAppRepository.findById(id).get();
    }
    public List<StudentApp> getAllData()
    {
        if(studentAppRepository.findAll().isEmpty())
        {
            throw new StudentAppNotFoundException("The data base is Empty please add data frist.");

        }
        return studentAppRepository.findAll();
    }
    public void deleteData(Long id)
    {
        if(studentAppRepository.findById(id).isEmpty())
        {
            throw new StudentAppNotFoundException("The given ID("+id+") is not available at the moment.");
        }
        studentAppRepository.deleteById(id);
    }
}
