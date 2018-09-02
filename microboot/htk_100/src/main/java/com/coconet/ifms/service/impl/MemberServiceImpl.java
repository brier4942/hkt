package com.coconet.ifms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.coconet.ifms.dao.HktAdminUserMapper;
import com.coconet.ifms.service.MemberService;
import com.coconet.ifms.vo.HktAdminUser;

@Service
public class MemberServiceImpl implements MemberService {
@Resource
	private HktAdminUserMapper htkadminusermapper; 
	@Override
	public HktAdminUser findByMember(String username, String password) {
		// TODO Auto-generated method stub
		HktAdminUser record =new HktAdminUser();
		record.setUserName(username);
		record.setPassword(password);
		
		
		return htkadminusermapper.selectByUsernameAndPassword(record);
	}

	
}
