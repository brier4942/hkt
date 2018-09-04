package com.coconet.ifms.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.coconet.ifms.dao.HktGoodsMapper;
import com.coconet.ifms.dao.HktLmMapper;
import com.coconet.ifms.dao.HktLmmxMapper;
import com.coconet.ifms.dao.HtkBannerMapper;
import com.coconet.ifms.service.BannerService;
import com.coconet.ifms.service.HktlamService;
import com.coconet.ifms.vo.HktBanner;
import com.coconet.ifms.vo.HktGoods;
import com.coconet.ifms.vo.HktLm;
import com.coconet.ifms.vo.HktLmmx;
@Service
public class HktlamServiceImpl implements HktlamService {
@Resource
private HktLmMapper htklmmapper;
@Resource
private HktLmmxMapper htklmmxapperl;
@Resource
private HktGoodsMapper hktgoodsmapper;


@Override
public List<Object> findAll() {
	// TODO Auto-generated method stub
	List<HktLm> one =htklmmapper.findAll();
	List<Object> li=new ArrayList<>();
	one .forEach((vo)->{
		List<HktLmmx> two =htklmmxapperl.selectByLmid(vo.getId());
		HashMap<String, Object> temp=new HashMap<>();
		temp.put("id", vo.getId());
		temp.put("titletype", vo.getTitletype());
		temp.put("url", vo.getUrl());
		temp.put("name", vo.getName());
		temp.put("intro", vo.getIntro());
		temp.put("sx", vo.getSx());
		temp.put("is_show", vo.getIsShow());
		temp.put("title_show", vo.getTitleShow());
		List<Object> twoLi=new ArrayList<>();
		for (HktLmmx record:two) {
		HashMap<String, Object> temp1=new HashMap<>();
		temp1.put("type", record.getType());
		temp1.put("value", record.getValue());
		temp1.put("sx", record.getSx());
		temp1.put("url", record.getIsShow());
		temp1.put("lmid", record.getLmid());
		if (record.getType().equals("sp")) {
		HktGoods goods=	hktgoodsmapper.selectByPrimaryKey(Integer.valueOf(record.getValue()));
		
		HashMap<String, Object> temp2=new HashMap<>();
		temp2.put("goodsname", goods.getGoodsName());
		temp2.put("goodsimg", goods.getGoodsImg());
		temp1.put("children", temp2);
		}	
		twoLi.add(temp1);
		}

		temp.put("children", twoLi);
		
		li.add(temp);
		
		
	});
	
	return li;
}


}
