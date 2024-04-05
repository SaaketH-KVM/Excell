package com.Saaketh.Quiz.Models;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Document(collection="Question")
public class Question {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String questiontitle;
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	private String rightAnswer;
	private String difficultyLevel;
	private String category;
	
	public Question(Integer id, String questiontitle, String option1, String option2, String option3, String option4,
			String rightAnswer, String difficultyLevel, String category) {
		super();
		this.id = id;
		this.questiontitle = questiontitle;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.rightAnswer = rightAnswer;
		this.difficultyLevel = difficultyLevel;
		this.category = category;
	}
	
	public Question()
	{
		
	}

}
