package com.example.lesson02;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson02.bo.UsedGoodsBO;
import com.example.lesson02.domain.UsedGoods;

@RequestMapping("/lesson02")
@RestController
public class Lesson02Ex01RestController {
	
	@Autowired
	private UsedGoodsBO usedGoodsBO;
	
	// http://localhost/lesson02/ex01 
	@RequestMapping("/ex01")
	public List<UsedGoods> ex01() {
		return usedGoodsBO.getUsedGoodsList(); // response => JSON
	}
}
