package com.local.api.manage.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.local.api.manage.exam.entity.Question;

public interface IQuestionRepository extends JpaRepository<Question, Integer> {

}
