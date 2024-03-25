package com.example.test.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.domain.Company;
import com.example.test.mapper.CompanyMapper;

@Service
public class CompanyBO {
	@Autowired
	private CompanyMapper companyMapper;
	
	public List<Company> getCompanyList() {
		return companyMapper.seleCompanyList();
	}
}
