package com.local.api.manage.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;

import com.local.api.manage.exam.entity.Student;
import com.local.api.manage.exam.error.ManageOutputException;
import com.local.api.manage.exam.iservice.IStudentService;
import com.local.api.manage.exam.util.ResponseApi;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private IStudentService studentService;
	
	@PostMapping("/save")
	public ResponseEntity<?> saveStudent(@RequestBody Student student) {
		ResponseApi response = null;
		try {
			if (student != null) {
				if (student.getIdStudent() == null) {
					response = ManageOutputException.manageException(HttpStatus.OK, this.studentService.saveStudent(student), null, null, null);
				} else {
					throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Se está enviando un ID en la petición");
				}
			} else {
				throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Ningún dato recibido");
			}
		} catch (Exception e) {
			response = ManageOutputException.manageException(HttpStatus.BAD_REQUEST, null, e.getMessage(), e.getMessage(), null);
			return new ResponseEntity<ResponseApi>(response, HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<ResponseApi>(response, HttpStatus.OK);
	}
	
}
