//package com.Saaketh.Quiz.Models;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import lombok.Data;
//
//@Entity
//@Data
//public class QuestionWrapper {
//	
//	@Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Integer id;
//	private String questiontitle;
//	private String option1;
//	private String option2;
//	private String option3;
//	private String option4;
//	private String category;
//	
//	public QuestionWrapper(Integer id, String questiontitle, String option1, String option2, String option3,
//			String option4, String category) {
//		super();
//		this.id = id;
//		this.questiontitle = questiontitle;
//		this.option1 = option1;
//		this.option2 = option2;
//		this.option3 = option3;
//		this.option4 = option4;
//		this.category = category;
//	}
//
//
//}