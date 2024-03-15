package com.ff.quizApp.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String question;
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	private String rightAnswer;
	private String category;
	private String difficultyLevel;
	@CreationTimestamp
	private String createdTime;
	@UpdateTimestamp
	private String updatedTime;
	
	
}
