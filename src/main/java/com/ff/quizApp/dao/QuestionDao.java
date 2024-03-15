package com.ff.quizApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ff.quizApp.entity.Question;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer>{

}
