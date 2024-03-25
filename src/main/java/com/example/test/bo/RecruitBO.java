package com.example.test.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.domain.Recruit;
import com.example.test.mapper.RecruitMapper;

@Service
public class RecruitBO {
	
	@Autowired
	private RecruitMapper recruitMapper;
	
	public List<Recruit> getRecruitList() {
		return recruitMapper.selectRecruitList();
	}
}
