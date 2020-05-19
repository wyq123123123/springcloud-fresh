package com.yc.fresh.mapper;

import java.util.List;

import com.yc.fresh.entity.GoodsInfo;

public interface IGoodsInfoMapper {
	/**
	 * 首页查询，查询每种商品类型的最新4条数据
	 * @return
	 */
	public List<GoodsInfo> finds();
}
