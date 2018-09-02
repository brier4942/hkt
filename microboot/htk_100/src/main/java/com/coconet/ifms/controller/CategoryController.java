package com.coconet.ifms.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.coconet.ifms.service.CatGoryservice;
@RequestMapping("category")
@Controller
public class CategoryController {
	@Resource
	private CatGoryservice catGoryservice;
	@RequestMapping("getmenu")
	@ResponseBody
	public String menu() {
		
		return JSONObject.toJSONString(catGoryservice.findByPid());
		
	}

}
