package com.Saaketh.Quiz.Repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Saaketh.Quiz.Models.Question;

@Repository
public interface QuestionRepository extends MongoRepository<Question,Integer>{


	List<Question> findByCategory(String category);




}


//@Query(value = "SELECT * FROM question q where q.category = :category ORDER BY RAND() LIMIT :numQ", nativeQuery = true)
//List<Question> findRandomQuestions(String category, int numQ);