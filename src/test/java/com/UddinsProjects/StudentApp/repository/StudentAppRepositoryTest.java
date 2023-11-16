package com.UddinsProjects.StudentApp.repository;

import com.UddinsProjects.StudentApp.entity.StudentApp;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
public class StudentAppRepositoryTest {

    private StudentAppRepository studentAppRepository;
    StudentApp studentApp;


    @BeforeEach
    void setUp() {
        studentApp=new StudentApp("Siyam","Uddin","2002/10/28","siyamuddin177@gmail.com","17@siyam@17","01059253773");

studentAppRepository.save(studentApp);
    }

    @AfterEach
    void tearDown() {
        studentApp=null;
        studentAppRepository.deleteAll();
    }

//    @Test
//    void testfindByStudentName()
//    {
//        List<StudentApp> studentAppList=studentAppRepository.findByStudentName("Siyam");
//        assertThat(studentAppList.get(0).getDateOfBirth()).isEqualTo(studentApp.getDateOfBirth());
//        assertThat(studentAppList.get(0).getEmail()).isEqualTo(studentApp.getEmail());
//    }




}
