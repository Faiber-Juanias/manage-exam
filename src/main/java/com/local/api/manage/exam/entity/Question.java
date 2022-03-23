package com.local.api.manage.exam.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pregunta")
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pregunta")
	private Integer idQuestion;
	@Column(name = "descripcion")
	private String description;
	@Column(name = "valores")
	private String values;
	@Column(name = "valor_pregunta")
	private Double valueQuestion;
	@Column(name = "respuesta")
	private Integer answer;
	
	@OneToOne
	@JoinColumn(name = "examen_id")
	private Exam exam;

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

	public Exam getExam() {
		return exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	@Override
	public String toString() {
		return "Question [idQuestion=" + idQuestion + ", description=" + description + ", values=" + values
				+ ", valueQuestion=" + valueQuestion + ", answer=" + answer + ", exam=" + exam + "]";
	}
	
}
