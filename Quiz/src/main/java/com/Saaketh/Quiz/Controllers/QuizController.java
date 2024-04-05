//package com.Saaketh.Quiz.Controllers;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.Saaketh.Quiz.Models.QuestionWrapper;
//import com.Saaketh.Quiz.Services.QuizService;
//
//@RestController
//@RequestMapping("/Quiz")
//public class QuizController {
//	
//	@Autowired
//	private QuizService quizservice;
//	
//	@PostMapping("/create")
//	public ResponseEntity<String> createQuiz(@RequestParam String category, @RequestParam int numQ,@RequestParam String title){
//		return quizservice.createQuiz(category, numQ,title);
//	}
//	
//	@GetMapping("/get/{id}")
//	public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(@PathVariable Integer id){
//		return quizservice.getQuizQuestions(id);
//		
//	}
//	
//	
//}