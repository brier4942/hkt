package com.coconet.ifms.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.coconet.ifms.service.GoodService;

@Controller
@RequestMapping("goods")

public class GoodsController {
@Resource
private GoodService goodService;
@RequestMapping("getbyid")
@ResponseBody
public String getbyid(Integer gid) {
	
	
	return JSONObject.toJSONString(goodService.getByid(gid));
	
}

@RequestMapping("getbycondition")
@ResponseBody
public String getByCondition(Integer catid, String goodsname, int currentPage, int pageSize) {
	
	
	return JSONObject.toJSONString(goodService.getAll(catid, goodsname, currentPage, pageSize));
	
}
@RequestMapping("getImg")
@ResponseBody
public String getImg(Integer gid) {
	
	
	return JSONObject.toJSONString(goodService.getImg(gid));
	
}

@RequestMapping("getAttr")
@ResponseBody
public String getAttr(Integer gid) {
	
	
	return JSONObject.toJSONString(goodService.getAttbute(gid));
	
}
	
}
