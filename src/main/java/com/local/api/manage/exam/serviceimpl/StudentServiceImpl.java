package com.local.api.manage.exam.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.local.api.manage.exam.entity.Student;
import com.local.api.manage.exam.iservice.IStudentService;
import com.local.api.manage.exam.repository.IStudentRepository;

@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private IStudentRepository studentRepo;
	
	@Override
	public Student saveStudent(Student student) {
		return this.studentRepo.save(student);
	}

}
