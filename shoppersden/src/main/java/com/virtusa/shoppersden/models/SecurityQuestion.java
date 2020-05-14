package com.virtusa.shoppersden.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@ Table(name = "Security_Question")
public class SecurityQuestion {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name = "Question_Id",updatable = false)
	private int questionId;
	
	@Column(name = "Question",unique = true,nullable = false,length = 100)
	private String question;

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}
	
	
	
}
