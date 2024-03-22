package com.example.lesson02.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.lesson02.domain.UsedGoods;

@Mapper
public interface UsedGoodsMapper {
	
	// input: (BO로부터 받아온다.) X
	// output: (BO한테 줄 것) List<UsedGoods>
	public List<UsedGoods> selectUsedGoodsList();
}
