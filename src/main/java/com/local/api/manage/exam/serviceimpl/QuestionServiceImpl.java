package com.local.api.manage.exam.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.local.api.manage.exam.entity.Question;
import com.local.api.manage.exam.entity.response.QuestionResponse;
import com.local.api.manage.exam.iservice.IQuestionService;
import com.local.api.manage.exam.repository.IQuestionRepository;

@Service
public class QuestionServiceImpl implements IQuestionService {
	
	@Autowired
	private IQuestionRepository questionRepo;

	@Override
	public Question saveQuestion(Question question) {
		return this.questionRepo.save(question);
	}

	@Override
	public List<Question> saveAllQuestion(List<Question> listQuestions) {
		return this.questionRepo.saveAll(listQuestions);
	}
	
	@Override
	public List<QuestionResponse> transformQuestions(List<Question> list) {
		List<QuestionResponse> res = new ArrayList<>();
		for (Question question : list) {
			QuestionResponse q = new QuestionResponse();
			q.setIdQuestion(question.getIdQuestion());
			q.setDescription(question.getDescription());
			q.setValues(question.getValues());
			q.setValueQuestion(question.getValueQuestion());
			q.setAnswer(question.getAnswer());
			
			res.add(q);
		}
		return res;
	}

}
