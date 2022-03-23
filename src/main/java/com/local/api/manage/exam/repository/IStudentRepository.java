package com.local.api.manage.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.local.api.manage.exam.entity.Student;

public interface IStudentRepository extends JpaRepository<Student, Integer> {

}
