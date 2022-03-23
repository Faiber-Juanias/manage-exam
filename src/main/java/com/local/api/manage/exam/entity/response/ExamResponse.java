package com.local.api.manage.exam.entity.response;

import java.util.List;

public class ExamResponse {

	private Integer idExam;
	private String name;
	private List<QuestionResponse> questions;
	
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
	public List<QuestionResponse> getQuestions() {
		return questions;
	}
	public void setQuestions(List<QuestionResponse> questions) {
		this.questions = questions;
	}
	@Override
	public String toString() {
		return "ExamRequest [idExam=" + idExam + ", name=" + name + ", questions=" + questions + "]";
	}
	
}
