package com.yc.fresh.mapper;

import java.util.List;

import com.yc.fresh.entity.GoodsType;

public interface IGoodsTypeMapper {
	/**
	 * 查询所有商品类型信息
	 * @return
	 */
	public List<GoodsType> finds();
}
