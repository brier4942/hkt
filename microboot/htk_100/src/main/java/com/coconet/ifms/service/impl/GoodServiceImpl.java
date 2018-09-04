package com.coconet.ifms.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.coconet.ifms.dao.HktAttributeMapper;
import com.coconet.ifms.dao.HktGoodsAttrMapper;
import com.coconet.ifms.dao.HktGoodsGalleryMapper;
import com.coconet.ifms.dao.HktGoodsMapper;
import com.coconet.ifms.service.GoodService;
import com.coconet.ifms.vo.GoodsAttr;
import com.coconet.ifms.vo.HktAttribute;
import com.coconet.ifms.vo.HktGoods;
import com.coconet.ifms.vo.HktGoodsGallery;
import com.coconet.ifms.vo.PageBean;
import com.github.pagehelper.PageHelper;
@Service
public class GoodServiceImpl implements GoodService {
@Resource
private HktGoodsMapper hktgoodsmaperr;
@Resource
private HktGoodsGalleryMapper hktgoodsgallermapper;
@Resource
private HktAttributeMapper hktAttrmapper;
	@Override
	public Map<String, Object> getAll(Integer catid, String goodsname, int currentPage, int pageSize) {
		PageHelper.startPage(currentPage, pageSize);
		Map<String, Object> map=new HashMap<>();
		map.put("catid",catid);
		map.put("goodsname","%" +goodsname+ "%");
		List<HktGoods> li = hktgoodsmaperr.selectByCondition(map);
		int sum = hktgoodsmaperr.countByCondition(map);
		PageBean<HktGoods> pageData = new PageBean<>(currentPage, pageSize, sum);
		pageData.setItems(li);
		int totalPageNum = (sum + pageSize - 1) / pageSize;
		//request.setAttribute("totalPages", totalPageNum);
        Map<String, Object> result=new HashMap<>();
        result.put("totalPages", totalPageNum);
        result.put("result", pageData.getItems());

		return result;
	}
	@Override
	public HktGoods getByid(Integer goodsId) {
		// TODO Auto-generated method stub
		return hktgoodsmaperr.selectByPrimaryKey(goodsId);
	}
	@Override
	public HktGoodsGallery getImg(Integer goods_id) {
		// TODO Auto-generated method stub
		return hktgoodsgallermapper.selectByPrimaryKey(goods_id);
	}
	@Override
	public List<GoodsAttr> getAttbute(Integer goods_id) {
		// TODO Auto-generated method stub
		return hktAttrmapper.getAttrBygid(goods_id);
	}
	
	

}
