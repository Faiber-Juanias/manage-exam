package com.local.api.manage.exam.entity.response;

import java.util.Date;
import java.util.List;

import com.local.api.manage.exam.entity.Student;

public class ExamAssignmentDateResponse {

	private Integer idExam;
	private List<Student> students;
	private Date date;
	
	public Integer getIdExam() {
		return idExam;
	}
	public void setIdExam(Integer idExam) {
		this.idExam = idExam;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "ExamAssignmentDateResponse [idExam=" + idExam + ", students=" + students + ", date=" + date + "]";
	}
	
}
