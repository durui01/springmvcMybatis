package com.baidu.mapper;

import java.util.List;

import com.baidu.pojo.Emp;

public interface EmpMapper {
   public List<Emp> queryAll() throws Exception;
}
