package com.example.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson03.bo.ReviewBO;
import com.example.lesson03.domain.Review;

@RequestMapping("/lesson03")
@RestController
public class Lesson03Ex01RestController {
	@Autowired
	private ReviewBO reviewBO;
	
	@RequestMapping("/ex01")
	public Review ex01() {
		return reviewBO.getReview();
	}
}
