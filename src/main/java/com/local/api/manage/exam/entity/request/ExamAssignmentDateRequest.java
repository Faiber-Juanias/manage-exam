package com.local.api.manage.exam.entity.request;

import java.util.Arrays;
import java.util.Date;

public class ExamAssignmentDateRequest {

	private Integer idExam;
	private Integer[] students;
	private Date date;
	
	public Integer getIdExam() {
		return idExam;
	}
	public void setIdExam(Integer idExam) {
		this.idExam = idExam;
	}
	public Integer[] getStudents() {
		return students;
	}
	public void setStudents(Integer[] students) {
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
		return "ExamAssignmentDateRequest [idExam=" + idExam + ", students=" + Arrays.toString(students) + ", date="
				+ date + "]";
	}
	
}
