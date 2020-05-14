package com.virtusa.shoppersden.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.virtusa.shoppersden.models.SecurityQuestion;
import com.virtusa.shoppersden.services.SecurityQuestionService;

@RestController
public class SecurityQuestionController {

	@Autowired
	private SecurityQuestionService securityQuestionService;
	
	@GetMapping("/getquestions")
	public List<SecurityQuestion> getAllQuestions()
	{
		return securityQuestionService.getAllQuestions();
	}
	
	@PostMapping("/addquestion")
	public SecurityQuestion addQuestion(@RequestBody SecurityQuestion question)
	{
		return securityQuestionService.addQuestion(question);
	}
	
	@PostMapping("/updatequestion")
	public SecurityQuestion updateQuestion(@RequestBody SecurityQuestion question)
	{
		return securityQuestionService.addQuestion(question);
	}
	
	@PostMapping("/deletequestion/{questionId}")
	public void deleteQuestion(@PathVariable int questionId)
	{
		securityQuestionService.deleteQuestion(questionId);
	}
}
