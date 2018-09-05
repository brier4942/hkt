package com.coconet.ifms.service;

import java.util.List;
import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

import com.coconet.ifms.vo.GoodsAttr;
import com.coconet.ifms.vo.HktAttribute;
import com.coconet.ifms.vo.HktGoods;
import com.coconet.ifms.vo.HktGoodsGallery;



public interface GoodService {
	public Map<String, Object> getAll( Integer cat_id,String goodsname, int currentPage, int pageSize) ;
	public HktGoods getByid( Integer goods_id) ;
	public List<HktGoodsGallery> getImg( Integer goods_id) ;
	public List<GoodsAttr> getAttbute( Integer goods_id);

}
