package com.UddinsProjects.StudentApp.service;

import com.UddinsProjects.StudentApp.entity.StudentApp;
import com.UddinsProjects.StudentApp.repository.StudentAppRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


class StudentAppServiceImplementTest {

    @Mock
    private StudentAppRepository studentAppRepository;
    private StudentAppService studentAppService;
    AutoCloseable autoCloseable;
    StudentApp studentApp;

    @BeforeEach
    void setUp() {
        autoCloseable= MockitoAnnotations.openMocks(this);
        studentAppService=new StudentAppServiceImplement(studentAppRepository);
        studentApp=new StudentApp("Siyam","Uddin","2002/10/28","siyamuddin177@gmail.com","17@siyam@17","01059253773");

    }

    @AfterEach
    void tearDown() throws Exception {
        autoCloseable.close();
    }

    @Test
    void testCreateData() {
        mock(StudentApp.class);
        mock(StudentAppRepository.class);

        when(studentAppRepository.save(studentApp)).thenReturn(studentApp);
        assertThat(studentAppService.createData(studentApp)).isEqualTo("success");
    }

    @Test
    void testUpdateData() {
        mock(StudentApp.class);
        mock(StudentAppRepository.class);

        when(studentAppRepository.save(studentApp)).thenReturn(studentApp);
        assertThat(studentAppService.updateData(studentApp)).isEqualTo("success");
    }

    @Test
    void getData() {
    }

    @Test
    void getAllData() {
    }

    @Test
    void deleteData() {
    }
}