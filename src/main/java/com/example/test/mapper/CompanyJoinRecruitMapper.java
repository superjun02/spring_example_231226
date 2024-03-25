package com.example.test.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.test.domain.CompanyJoinRecruit;

@Mapper
public interface CompanyJoinRecruitMapper {
	public List<CompanyJoinRecruit> selectCompanyJoinRecruitList();
}
