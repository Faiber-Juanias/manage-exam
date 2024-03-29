package com.local.api.manage.exam.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "examen")
public class Exam {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_examen")
	private Integer idExam;
	@Column(name = "nombre")
	private String name;
	
	public Exam(Integer id) {
		this.idExam = id;
	}
	
	public Exam(String name) {
		this.name = name;
	}
	
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
	
	@Override
	public String toString() {
		return "Exam [idExam=" + idExam + ", name=" + name + "]";
	}
	
}
