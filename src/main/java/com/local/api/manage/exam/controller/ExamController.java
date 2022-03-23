package com.local.api.manage.exam.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;

import com.local.api.manage.exam.config.ManageExamConfig;
import com.local.api.manage.exam.entity.Exam;
import com.local.api.manage.exam.entity.ExamStudent;
import com.local.api.manage.exam.entity.Question;
import com.local.api.manage.exam.entity.Student;
import com.local.api.manage.exam.entity.request.ExamAssignmentDateRequest;
import com.local.api.manage.exam.entity.request.ExamRequest;
import com.local.api.manage.exam.entity.response.ExamResponse;
import com.local.api.manage.exam.error.ManageOutputException;
import com.local.api.manage.exam.iservice.IExamService;
import com.local.api.manage.exam.iservice.IExamStudentService;
import com.local.api.manage.exam.iservice.IQuestionService;
import com.local.api.manage.exam.util.ResponseApi;

@RestController
@RequestMapping("/exam")
public class ExamController {
	
	@Autowired
	private IExamService examService;
	@Autowired
	private IQuestionService questionService;
	@Autowired
	private IExamStudentService examStudentService;
	@Autowired
	private ManageExamConfig config;

	@PostMapping("/save")
	public ResponseEntity<?> saveExam(@RequestBody ExamRequest exam) {
		Exam newExam = null;
		ResponseApi response = null;
		ExamResponse examResponse = new ExamResponse();
		List<Question> listQuestions = new ArrayList<>();
		try {
			if (exam != null) {				
				newExam = this.examService.saveExam(new Exam(exam.getName()));
				if (exam.getQuestions().size() > 0) {
					Double totalValQuestion = 0.0;
					for (Question question : exam.getQuestions()) {
						question.setExam(newExam);
						totalValQuestion+=question.getValueQuestion();
					}
					if (totalValQuestion == 100) {
						listQuestions = this.questionService.saveAllQuestion(exam.getQuestions());
					} else {
						this.examService.deleteExamById(newExam.getIdExam());
						throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "El valor de cada pregunta no suma 100");
					}
					examResponse.setIdExam(newExam.getIdExam());
					examResponse.setName(newExam.getName());
					examResponse.setQuestions(this.questionService.transformQuestions(listQuestions));
					response = ManageOutputException.manageException(HttpStatus.OK, examResponse, null, null, null);
				} else {
					this.examService.deleteExamById(newExam.getIdExam());
					throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "No se ha recibido ningúna pregunta");
				}
			} else {
				throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Ningún dato recibido");
			}
		} catch (HttpClientErrorException e) {
			response = ManageOutputException.manageException(HttpStatus.BAD_REQUEST, null, e.getMessage(), e.getMessage(), null);
			return new ResponseEntity<ResponseApi>(response, HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<ResponseApi>(response, HttpStatus.OK);
	}
	
	@PostMapping("/assignment")
	public ResponseEntity<?> examAssignment(@RequestBody ExamAssignmentDateRequest assignment) {
		ResponseApi response = null;
		List<ExamStudent> listResult = new ArrayList<>();
		try {
			if (assignment != null && assignment.getIdExam() != null && 
					assignment.getStudents() != null && assignment.getStudents().length > 0) {
				Exam exam = new Exam(assignment.getIdExam());
				for (Integer i : assignment.getStudents()) {
					ExamStudent ex = new ExamStudent();
					ex.setExam(exam);
					ex.setStudent(new Student(i));
					ex.setExamDate(assignment.getDate());
					
					listResult.add(ex);
				}
				response = ManageOutputException.manageException(HttpStatus.OK, this.examStudentService.saveAllExamAssignment(listResult), null, null, null);
			} else {
				throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Todos los campos son obligatorios");
			}
		} catch (HttpClientErrorException e) {
			response = ManageOutputException.manageException(HttpStatus.BAD_REQUEST, null, e.getMessage(), e.getMessage(), null);
			return new ResponseEntity<ResponseApi>(response, HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<ResponseApi>(response, HttpStatus.OK);
	}
	
}
