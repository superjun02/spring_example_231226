package com.example.test.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.test.domain.Company;

@Mapper
public interface CompanyMapper {
	public List<Company> seleCompanyList();
}
