package com.example.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.lesson04.bo.UserBO;
import com.example.lesson04.domain.User;

@RequestMapping("/lesson04/ex01")
@Controller
public class Lesson04Ex01Controller {
	
	@Autowired
	private UserBO userBO;
	
	// 회원가입 화면
	// http://localhost/lesson04/ex01/add-user-view
	@RequestMapping(path = "/add-user-view", method = RequestMethod.GET)
	public String addUserView() {
		return "lesson04/addUser";
	}
	
	//
	@PostMapping("/add-user")
	public String addUser(
			@RequestParam(value = "name", required =  true) String name, 
			@RequestParam(value = "yyyymmdd", required = true) String yyyymmdd, 
			@RequestParam(value = "email", required = true) String email,     // 집에서 할때 workbench에서 null 불가로 바꿔주기
			@RequestParam(value = "introduce", required = false) String introduce) {
		
		// DB Insert
		userBO.addUser(name, yyyymmdd, email, introduce);
		
		return "/lesson04/afterAddUser";
	}
	
	// 최근에 가입된 한명의 유저 보는 화면
	// http://localhost/lesson04/ex01/latest-user-view
	@GetMapping("/latest-user-view")
	public String latestUserView(Model model) {
		// DB select
		User user = userBO.getLatestUser();
		model.addAttribute("result", user);
		model.addAttribute("title", "최근 가입된 유저 정보");
			
		return "lesson04/latestUser";
	}
}








