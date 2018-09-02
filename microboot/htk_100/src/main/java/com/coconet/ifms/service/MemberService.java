package com.coconet.ifms.service;

import com.coconet.ifms.vo.HktAdminUser;

public interface MemberService {
public HktAdminUser findByMember (String username,String password );
}
