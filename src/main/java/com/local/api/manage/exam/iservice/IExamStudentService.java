package com.local.api.manage.exam.iservice;

import java.util.List;

import com.local.api.manage.exam.entity.ExamStudent;

public interface IExamStudentService {

	ExamStudent saveExamAssignment(ExamStudent assignment);
	List<ExamStudent> saveAllExamAssignment(List<ExamStudent> list);
	
}
