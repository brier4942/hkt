package com.coconet.ifms.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.coconet.ifms.service.MemberService;

@Controller

public class DirectController {
	
		

	@RequestMapping("index")
	public String index() {
		return "index";
		
	}
	@RequestMapping("about")
	public String about() {
		return "about";
		
	}
	@RequestMapping("product")
	public String product() {
		return "product";
		
	}
	@RequestMapping("grid")
	public String grid() {
		return "grid";
		
	}

}
