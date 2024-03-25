package com.example.test.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.test.domain.Recruit;

@Mapper
public interface RecruitMapper {

	public List<Recruit> selectRecruitList();
}
