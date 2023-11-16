package com.UddinsProjects.StudentApp.repository;

import com.UddinsProjects.StudentApp.entity.StudentApp;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentAppRepository extends JpaRepository<StudentApp,Long> {
}
