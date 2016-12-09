package com.baidu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.baidu.mapper.EmpMapper;
import com.baidu.pojo.Emp;
import com.baidu.service.EmpService;

public class EmpServiceImpl implements EmpService {
    @Autowired
	private EmpMapper empMapper;
    
	public List<Emp> queryAll() throws Exception {
		// TODO Auto-generated method stub
		return empMapper.queryAll();
	}

}
