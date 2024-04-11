package com.example.lesson07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson04.bo.StudentBO;
import com.example.lesson07.entity.StudentEntity;

@RequestMapping("/lesson07")
@RestController
public class Lesson07Ex01RestController {
	@Autowired
	private StudentBO studentBO;
	
	// C: create
	@GetMapping("/ex01/create")
	public StudentEntity create() {
		String name = "이상준";
		String phoneNumber = "01011112222";
		String email = "superjun02@naver.com";
		String dreamJob = "개발자";
		
		// save 된 객체를 리턴하므로 id값이 채워져있다.
		return studentBO.addStudent(name, phoneNumber, email, dreamJob);
	}
	
	// U: update
	@GetMapping("/ex01/update")
	public StudentEntity update() {
		int id = 7;
		String dreamJob = "기획자";
		
		return studentBO.updateDreamJobById(id, dreamJob);
	}
	
	// D: delete
	@GetMapping("/ex01/delete")
	public String delete() {
		// id:6 삭제
		studentBO.deleteStudentById(6);
		
		return "삭제 완료";
	}
}
