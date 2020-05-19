package com.yc.fresh.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.fresh.mapper.IGoodsInfoMapper;
import com.yc.fresh.mapper.IGoodsTypeMapper;
import com.yc.fresh.service.IGoodsInfoService;

@Service
public class GoodsInfoServiceImpl implements IGoodsInfoService{
	@Autowired
	private IGoodsInfoMapper goodsInfoMapper;
	
	@Autowired
	private IGoodsTypeMapper goodsTypeMapper;
	
	/**
	 * 返回所有商品类型信息和每种类型的最新4条商品信息
	 */
	@Override
	public Map<String, Object> finds() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("types", goodsTypeMapper.finds()); // 所有商品类型信息，存到type键中
		map.put("goods", goodsInfoMapper.finds()); // 每种类型的最新4条商品信息，存到goods键中
		return map;
	}

}
