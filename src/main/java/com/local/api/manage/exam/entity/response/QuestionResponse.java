package com.local.api.manage.exam.entity.response;

public class QuestionResponse {
	
	private Integer idQuestion;
	private String description;
	private String values;
	private Double valueQuestion;
	private Integer answer;
	
	public Integer getIdQuestion() {
		return idQuestion;
	}
	public void setIdQuestion(Integer idQuestion) {
		this.idQuestion = idQuestion;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getValues() {
		return values;
	}
	public void setValues(String values) {
		this.values = values;
	}
	public Double getValueQuestion() {
		return valueQuestion;
	}
	public void setValueQuestion(Double valueQuestion) {
		this.valueQuestion = valueQuestion;
	}
	public Integer getAnswer() {
		return answer;
	}
	public void setAnswer(Integer answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "QuestionResponse [idQuestion=" + idQuestion + ", description=" + description + ", values=" + values
				+ ", valueQuestion=" + valueQuestion + ", answer=" + answer + "]";
	}
	
}
