package com.local.api.manage.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.local.api.manage.exam.entity.ExamStudent;

public interface IExamStudenRepository extends JpaRepository<ExamStudent, Integer> {

}
