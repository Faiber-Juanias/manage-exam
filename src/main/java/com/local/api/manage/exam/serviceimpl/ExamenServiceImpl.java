package com.local.api.manage.exam.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.local.api.manage.exam.entity.Exam;
import com.local.api.manage.exam.iservice.IExamService;
import com.local.api.manage.exam.repository.IExamRepository;

@Service
public class ExamenServiceImpl implements IExamService {
	
	@Autowired
	private IExamRepository examRepo;

	@Override
	public Exam saveExam(Exam exam) {
		return this.examRepo.save(exam);
	}

	@Override
	public void deleteExamById(Integer id) {
		this.examRepo.deleteById(id);
	}

}
