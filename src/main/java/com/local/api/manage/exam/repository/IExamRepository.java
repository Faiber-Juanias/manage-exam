package com.local.api.manage.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.local.api.manage.exam.entity.Exam;

public interface IExamRepository extends JpaRepository<Exam, Integer> {

}
