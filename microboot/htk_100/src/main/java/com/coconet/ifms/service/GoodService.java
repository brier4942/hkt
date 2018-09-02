package com.coconet.ifms.service;

import java.util.Map;

import com.coconet.ifms.vo.HktGoods;



public interface GoodService {
	public Map<String, Object> getAll( Integer cat_id,String goodsname, int currentPage, int pageSize) ;
	public HktGoods getByid( Integer goods_id) ;

}
