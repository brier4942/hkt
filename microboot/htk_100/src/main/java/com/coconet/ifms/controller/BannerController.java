package com.coconet.ifms.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.alibaba.fastjson.JSONObject;
import com.coconet.ifms.service.BannerService;

@Controller
@RequestMapping("banner")
public class BannerController {
	@Resource
	private BannerService bannerService;

	@RequestMapping("getall")
	@ResponseBody
	public String getAll() {
		return JSONObject.toJSONString(bannerService.findAll());
	}

}
