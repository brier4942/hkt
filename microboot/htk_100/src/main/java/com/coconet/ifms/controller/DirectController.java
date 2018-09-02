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

}
