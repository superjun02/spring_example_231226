package com.example.lesson05;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/lesson05")
@Controller
public class Lesson05Controller {

	// http://localhost/lesson05/ex01
	@GetMapping("/ex01")
	public String ex01() {
		return "lesson05/ex01";
	}

	// http://localhost/lesson05/ex02
	@GetMapping("/ex02")
	public String ex02(Model model) {
		// List<String>
		List<String> fruits = new ArrayList<>();
		
		fruits.add("사과");
		fruits.add("딸기");
		fruits.add("바나나");
		fruits.add("포도");
		fruits.add("수박");
		
		// List<Map<String, Object>>
		List<Map<String, Object>> users = new ArrayList<>();
		Map<String, Object> user = new HashMap<>();
		user.put("name", "이상준");
		user.put("age", "24");
		user.put("hobby", "게임");
		users.add(user);
		
		user = new HashMap<>();
		user.put("name", "정두원");
		user.put("age", "25");
		user.put("hobby", "메이플");
		users.add(user);
		
		model.addAttribute("fruits", fruits);
		model.addAttribute("users", users);
		return "lesson05/ex02";
	}
	
	// http://localhost/lesson05/ex03
	@GetMapping("/ex03")
	public String ex03(Model model) {
		Date now = new Date();
		model.addAttribute("now", now);
		
		return "lesson05/ex03";
	}
	
	// http://localhost/lesson05/ex04
	@GetMapping("/ex04")
	public String ex04(Model model) {
		
		
		return "lesson05/ex04";
	}
}
