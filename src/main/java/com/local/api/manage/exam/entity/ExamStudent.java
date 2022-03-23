package com.local.api.manage.exam.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "examen_estudiante")
public class ExamStudent{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idExamStuden;
	@OneToOne
	@JoinColumn(name = "estudiante_id")
	private Student student;
	@OneToOne
	@JoinColumn(name = "examen_id")
	private Exam exam;
	@Column(name = "realizado")
	private String done = "NO";
	@Column(name = "fecha_examen")
	private Date examDate;
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Exam getExam() {
		return exam;
	}
	public void setExam(Exam exam) {
		this.exam = exam;
	}
	public String getDone() {
		return done;
	}
	public void setDone(String done) {
		this.done = done;
	}
	public Date getExamDate() {
		return examDate;
	}
	public void setExamDate(Date examDate) {
		this.examDate = examDate;
	}
	@Override
	public String toString() {
		return "ExamStudent [student=" + student + ", exam=" + exam + ", done=" + done + ", examDate=" + examDate + "]";
	}
	
}
