package com.local.api.manage.exam.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estudiante")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_estudiante")
	private Integer idStudent;
	@Column(name = "nombre")
	private String name;
	@Column(name = "edad")
	private Integer age;
	@Column(name = "ciudad")
	private String city;
	@Column(name = "zona_horaria")
	private String timeZone;
	
	public Student(Integer id) {
		this.idStudent = id;
	}
	
	public Integer getIdStudent() {
		return idStudent;
	}
	public void setIdStudent(Integer idStudent) {
		this.idStudent = idStudent;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getTimeZone() {
		return timeZone;
	}
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}
	@Override
	public String toString() {
		return "Student [idStudent=" + idStudent + ", name=" + name + ", age=" + age + ", city=" + city + ", timeZone="
				+ timeZone + "]";
	}
	
}
