package com.coconet.ifms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.coconet.ifms.dao.HtkBannerMapper;
import com.coconet.ifms.service.BannerService;
import com.coconet.ifms.vo.HktBanner;
@Service
public class BannerServiceImpl implements BannerService {
@Resource
private HtkBannerMapper hktbanner;
	@Override
	public List<HktBanner> findAll() {
		// TODO Auto-generated method stub
		return hktbanner.SelectAll();
	}

}
