package com.virtusa.shoppersden.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.shoppersden.models.SecurityQuestion;
import com.virtusa.shoppersden.repository.SecurityQuestionRepository;

@Service
public class SecurityQuestionService {

	@Autowired
	private SecurityQuestionRepository securityQuestionRepository;

	public List<SecurityQuestion> getAllQuestions() {
		return securityQuestionRepository.findAll();
	}

	public SecurityQuestion addQuestion(SecurityQuestion question) {
		return securityQuestionRepository.save(question);
	}

	public SecurityQuestion updateQuestion(SecurityQuestion question) {
		return securityQuestionRepository.save(question);
	}

	public void deleteQuestion(int questionId) {
		securityQuestionRepository.delete(questionId);
	}
	
	public SecurityQuestion findQuestionById(String questionId)
	{
		int id=Integer.parseInt(questionId);
		return securityQuestionRepository.findOne(id);
	}

}
