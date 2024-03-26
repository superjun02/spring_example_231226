package com.example.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson03.bo.ReviewBO;

@RestController
@RequestMapping("/lesson03")
public class Lesson03Ex03RestController {
	
	@Autowired
	private ReviewBO reviewBO;
	
	@RequestMapping("/ex03")
	public String ex03(
			@RequestParam(value = "id", required = true) int id
			, @RequestParam(value = "review", required = true) String review) {
		
		int rowCount = reviewBO.updateReviewById(id, review);
		
		return "변경 완료: " + rowCount;
	}
}
