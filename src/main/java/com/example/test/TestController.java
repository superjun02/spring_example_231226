package com.example.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.bo.CompanyBO;
import com.example.test.bo.RecruitBO;
import com.example.test.domain.Company;
import com.example.test.domain.Recruit;

@RestController
@RequestMapping("/test")
public class TestController {
	
	@Autowired
	private RecruitBO recruitBO;
	@Autowired
	private CompanyBO companyBO;
	
	@RequestMapping("/hello")
	public String helloWorld() {		
		return "Hello World!";
	}
	
	@RequestMapping("/recruit")
	public List<Recruit> recruit() {
		return recruitBO.getRecruitList();
	}
	
	@RequestMapping("/company")
	public List<Company> company() {
		return companyBO.getCompanyList();
	}
}
