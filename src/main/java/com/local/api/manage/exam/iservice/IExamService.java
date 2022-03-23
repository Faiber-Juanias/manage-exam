package com.local.api.manage.exam.iservice;

import com.local.api.manage.exam.entity.Exam;

public interface IExamService {

	Exam saveExam(Exam exam);
	void deleteExamById(Integer id);
	
}
