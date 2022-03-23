package com.local.api.manage.exam.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.local.api.manage.exam.entity.ExamStudent;
import com.local.api.manage.exam.iservice.IExamStudentService;
import com.local.api.manage.exam.repository.IExamStudenRepository;

@Service
public class ExamStudentServiceImpl implements IExamStudentService {

	@Autowired
	private IExamStudenRepository examStudentRepo;
	
	@Override
	public ExamStudent saveExamAssignment(ExamStudent assignment) {
		return this.examStudentRepo.save(assignment);
	}

}
