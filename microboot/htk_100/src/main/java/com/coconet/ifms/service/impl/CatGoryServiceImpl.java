package com.coconet.ifms.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.coconet.ifms.dao.HktCategoryMapper;
import com.coconet.ifms.service.CatGoryservice;
import com.coconet.ifms.vo.HktCategory;
@Service
public class CatGoryServiceImpl implements CatGoryservice{
@Resource
private HktCategoryMapper hktcategory;
	@Override
	public List<Object> findByPid() {
		Map<String, Object> map=new HashMap<>();
		List<Object>array=new ArrayList<>();
		short qo= 0;
		//pid=0数组1
		List<HktCategory> o=(List<HktCategory>) hktcategory.selectByPid(qo);

		
		o.forEach((vo)->{

			Map<String, Object> temp=new HashMap<>();
			temp.put("id", vo.getCatId());
			temp.put("title", vo.getCatName());		
            List<Object> top=new ArrayList<>();         
			List<HktCategory> two= hktcategory.selectByPid(vo.getCatId());			
			for (int i = 0; i < two.size(); i++) {
				Map<String, Object> temp1=new HashMap<>();
				HktCategory tvo=	two.get(i);
				temp1.put("id", tvo.getCatId());
				temp1.put("title", tvo.getCatName());				
				List<HktCategory> three= hktcategory.selectByPid(tvo.getCatId());			
	            List<Object> treeop=new ArrayList<>();         
	            for (int j = 0; j < three.size(); j++) {
					Map<String, Object> temp2=new HashMap<>();
					HktCategory vo3=	three.get(j);
					temp2.put("id", vo3.getCatId());
					temp2.put("title", vo3.getCatName());		
					treeop.add(temp2);
				}
				
				temp1.put("children",treeop );
				top.add(temp1);
			}
			temp.put("children", top);
			array.add(temp);
		});
		
		
		// TODO Auto-generated method stub
		return array;
	}

}
