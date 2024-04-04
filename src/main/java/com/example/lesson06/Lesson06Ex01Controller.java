package com.example.lesson06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.lesson04.bo.UserBO;

@RequestMapping("/lesson06/ex01")
@Controller
public class Lesson06Ex01Controller {
	@Autowired
	private UserBO userBO;
	
	// 회원가입 화면
	// http://localhost/lesson06/ex01/add-user-view
	@GetMapping("/add-user-view")
	public String addUserView() {
		return "lesson06/addUser";
	}
	
	// AJAX가 하는 요청 - 회원가입 진행
	// String return;
	@ResponseBody
	@PostMapping("/add-user")
	public String addUser(
			@RequestParam(value = "name") String name, 
			@RequestParam(value = "yyyymmdd") String yyyymmdd,
			@RequestParam(value = "email") String email,
			@RequestParam(value = "introduce", required = false) String introduce) {
		
		// DB INSERT
		userBO.addUser(name, yyyymmdd, email, introduce);
		
		// 응답값 => String
		return "성공";
	}
	
	@GetMapping("/after-add-user-view")
	public String afterAddUserView() {
		return "lesson06/afterAddUser";
	}
}
