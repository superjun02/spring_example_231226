package com.example.test.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.domain.CompanyJoinRecruit;
import com.example.test.mapper.CompanyJoinRecruitMapper;

@Service
public class CompanyJoinRecruitBO {
	@Autowired
	private CompanyJoinRecruitMapper companyJoinRecruitMapper;
	public List<CompanyJoinRecruit> getCompanyJoinRecruitList() {
		return companyJoinRecruitMapper.selectCompanyJoinRecruitList();
	}
}
