package com.Saaketh.Quiz.Services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.Saaketh.Quiz.Helper.MyExcellHelper;
import com.Saaketh.Quiz.Models.Question;
import com.Saaketh.Quiz.Repositories.QuestionRepository;

@Service
public class QuestionService {
	
	@Autowired
	private QuestionRepository questionrepository;

	public ResponseEntity<List<Question>> getAllQuestions() {
		try {
			return new ResponseEntity<>(questionrepository.findAll(), HttpStatus.OK);	
		}catch (Exception e)
		{
			e.printStackTrace();}
		
		return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);	
	}


	public ResponseEntity<List<Question>>getAllQuestionByCategory(String category) {
		
			try {
				return new ResponseEntity<>(questionrepository.findByCategory(category), HttpStatus.OK);	
			}catch (Exception e)
			{
				e.printStackTrace();}
			
			return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);	
		
	}
	
//	public Optional<Question> getAllQuestionById(Integer questionId) {
//		return questionrepository.findById(questionId);
//	}
	public ResponseEntity<Question> getAllQuestionById(Integer questionId) {
	    Question question = questionrepository.findById(questionId).orElse(null);
	    if (question != null) {
	        return ResponseEntity.ok(question);
	    } else {
	        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
	    }
	}

	public ResponseEntity<String> addQuestion(Question question) {
		questionrepository.save(question);
		return new ResponseEntity<>("success",HttpStatus.CREATED);
	}

	public String deleteById(Integer deleteId) {
		questionrepository.deleteById(deleteId);
		return "deleted successfully";
	}
	
	public void save(MultipartFile file) {
		try {
			List<Question> question= MyExcellHelper.convertExcellToListofProduct(file.getInputStream());
			this.questionrepository.saveAll(question);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<Question> getAllQuestions1(){
		return this.questionrepository.findAll();
		
	}



}
