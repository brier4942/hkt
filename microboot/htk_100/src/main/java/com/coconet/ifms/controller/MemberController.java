package com.coconet.ifms.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.coconet.ifms.service.MemberService;

@Controller
@RequestMapping("member")
public class MemberController {
	@Resource
	private MemberService memberservice;

	@RequestMapping("login")
	@ResponseBody
	public String longin(String username, String password) {
		if (memberservice.findByMember(username, password) != null) {
			return "true";
		} else {
			return "false";

		}

	}

}
