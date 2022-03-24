package com.local.api.manage.exam.iservice;

import java.util.List;

import com.local.api.manage.exam.entity.Student;

public interface IStudentService {

	Student saveStudent(Student student);
	List<Student> getAllStudents();
	List<Student> getAllStudentsByIds(List<Integer> ids);
	
}
