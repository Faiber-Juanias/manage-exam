package com.local.api.manage.exam.iservice;

import java.util.List;

import com.local.api.manage.exam.entity.Question;
import com.local.api.manage.exam.entity.response.QuestionResponse;

public interface IQuestionService {

	Question saveQuestion(Question question);
	List<Question> saveAllQuestion(List<Question> listQuestions);
	List<QuestionResponse> transformQuestions(List<Question> list);
	
}
