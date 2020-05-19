package com.yc.fresh.service;

import java.util.Map;

public interface IGoodsInfoService {
	/**
	 * 首页查询，查询每种商品类型的最新4条数据以及所有商品的类型信息
	 * @return
	 */
	public Map<String, Object> finds();
}
