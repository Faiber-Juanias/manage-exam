package com.local.api.manage.exam.entity.request;

import java.util.List;

import com.local.api.manage.exam.entity.Question;

public class ExamRequest {

	private Integer idExam;
	private String name;
	private List<Question> questions;
	
	public Integer getIdExam() {
		return idExam;
	}
	public void setIdExam(Integer idExam) {
		this.idExam = idExam;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
	@Override
	public String toString() {
		return "ExamRequest [idExam=" + idExam + ", name=" + name + ", questions=" + questions + "]";
	}
	
}
