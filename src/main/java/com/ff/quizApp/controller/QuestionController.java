package com.ff.quizApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ff.quizApp.dto.ResponseStructure;
import com.ff.quizApp.entity.Question;
import com.ff.quizApp.service.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {

	@Autowired
	private QuestionService questionService;

	@PostMapping
	public ResponseEntity<ResponseStructure<Question>> saveQuestion(@RequestBody Question question) {
		return questionService.saveQuestion(question);
	}
}
