package com.ff.quizApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ff.quizApp.dao.QuestionDao;
import com.ff.quizApp.dto.ResponseStructure;
import com.ff.quizApp.entity.Question;

@Service
public class QuestionService {

	@Autowired
	private QuestionDao dao;
	
	public ResponseEntity<ResponseStructure<Question>> saveQuestion(Question question) {
		Question savedQuestion = dao.save(question);
		ResponseStructure<Question> structure = new ResponseStructure<Question>();
		structure.setStatusCode(HttpStatus.CREATED.value());
		structure.setMessage("Success");
		structure.setData(savedQuestion);
		
		return new ResponseEntity<ResponseStructure<Question>>(structure, HttpStatus.CREATED);
	}

}
