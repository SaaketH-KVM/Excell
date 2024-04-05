//package com.Saaketh.Quiz.Services;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//
//import com.Saaketh.Quiz.Models.Question;
//import com.Saaketh.Quiz.Models.QuestionWrapper;
//import com.Saaketh.Quiz.Models.Quiz;
//import com.Saaketh.Quiz.Repositories.QuestionRepository;
//import com.Saaketh.Quiz.Repositories.QuizRepository;
//
//
//@Service
//public class QuizService {
//	
//	@Autowired
//	private QuizRepository quizrepository;
//	@Autowired
//	private QuestionRepository questionrepository;
//
//
//	public ResponseEntity<String> createQuiz(String category, int numQ, String title) {
//		
//		List<Question> questions = questionrepository.findRandomQuestions(category, numQ);
//		
//		Quiz quiz = new Quiz();
//		quiz.setQuestions(questions);
//		quiz.setTitle(title);
//		quizrepository.save(quiz);
//		return new ResponseEntity<>("success",HttpStatus.CREATED);
//	}
//
//
//	public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(Integer id) {
//		Optional<Quiz> quiz = quizrepository.findById(id);
//		List<Question> questionsFromDB = quiz.get().getQuestions();
//		List<QuestionWrapper> questionsForUser = new ArrayList<>();
//		
//		for(Question q : questionsFromDB) {
//			QuestionWrapper qw = new QuestionWrapper(q.getId(), q.getQuestiontitle(), q.getOption1(), q.getOption2(), q.getOption3(), q.getOption4(), q.getCategory());
//			questionsForUser.add(qw);
//			
//		}
//		
//		return new ResponseEntity<>(questionsForUser, HttpStatus.OK);
//	}
//
//}
