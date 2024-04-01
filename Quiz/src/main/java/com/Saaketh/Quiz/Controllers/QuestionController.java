package com.Saaketh.Quiz.Controllers;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.Saaketh.Quiz.Helper.MyExcellHelper;
import com.Saaketh.Quiz.Models.Question;
import com.Saaketh.Quiz.Services.QuestionService;


@RestController
@CrossOrigin("*")
@RequestMapping("/question")
public class QuestionController {
	
	@Autowired
	private QuestionService questionservice;
	
	@GetMapping("/giveall")
	public ResponseEntity<List<Question>> getAllQuestions() {
		return questionservice.getAllQuestions();
	}
	
	@GetMapping("/category/{category}")
	public ResponseEntity<List<Question>> getAllQuestionByCategory(@PathVariable String category) {
		return questionservice.getAllQuestionByCategory(category);
	
	}
	
//	@GetMapping("/QuestionId/{questionId}")
//	public Optional<Question> getAllQuestionById(@PathVariable Integer questionId) {
//		return questionservice.getAllQuestionById(questionId);
//	
//	}
	
	@GetMapping("/QuestionId/{questionId}")
	public ResponseEntity<Question> getAllQuestionById(@PathVariable Integer questionId) {
		return questionservice.getAllQuestionById(questionId);
	
	}
	
	
	@PostMapping("/add")
	public ResponseEntity<String> addQuestion(@RequestBody Question question) {
		return questionservice.addQuestion(question);
	}
	
	@DeleteMapping("/delete/{deleteId}")
	public String deleteQuestion(@PathVariable Integer deleteId) {
		questionservice.deleteById(deleteId);
		return "successfull";
	}
	
	@GetMapping("/viewQuestions")
	public String getQuestion() {
		
		return "hi";
		
	}
	
//	@PostMapping("/upload")
//	public ResponseEntity<?> upload(@RequestParam("file")MultipartFile file){
//		if(MyExcellHelper.checkExcelFormat(file)) {
//			this.questionservice.save(file);
//			return ResponseEntity.ok(Map.of("message","file is uploaded"));
//		}
//		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("please upload excell file only");
//		
//	}
    @PostMapping("/product/upload")
    public ResponseEntity<?> upload(@RequestParam("file") MultipartFile file) {
        if (MyExcellHelper.checkExcelFormat(file)) {
            //true

            this.questionservice.save(file);

            return ResponseEntity.ok(Map.of("message", "File is uploaded and data is saved to db"));


        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Please upload excel file ");
    }
	
	@GetMapping("/boll")
	public List<Question> getboll(){
		return this.questionservice.getAllQuestions1();
	}
}