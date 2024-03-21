package com.example.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/lesson01/ex01")
public class Lesson01Ex01Controller {

	// http://localhost:8080/lesson01/ex01/1
	// String을 브라우저에 출력
	@ResponseBody // 리턴되는 값은 Response Body에 넣어지고 HTML 응답
	@RequestMapping("/1")
	public String ex01_1() {
		return "<h2>문자열을 Response body에 보내는 예제</h2>";
	}

	// http://localhost:8080/lesson01/ex01/2
	// Map을 브라우저에 출력
	@ResponseBody // 리턴되는 값은 Response Body에 넣어지고 json 응답
	@RequestMapping("/2")
	public Map<String, Object> ex01_2() {
		Map<String, Object> map = new HashMap<>();
		map.put("사과", 12);
		map.put("딸기", 32);
		map.put("바나나", 2);
		map.put("포도", 203);
		
		return map;
	}
}
