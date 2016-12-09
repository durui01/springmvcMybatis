package com.baidu.handler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.baidu.pojo.Emp;
import com.baidu.service.EmpService;


@Controller  
public class EmpController {
	@Autowired
	private EmpService service ;
	@RequestMapping("queryAll")
	public ModelAndView queryAll() throws Exception {
		List<Emp> list=service.queryAll();
		ModelAndView model=new ModelAndView();
		model.addObject("queryAll",list);
		model.setViewName("empList");
		return model;
		
	}
	
	
}
