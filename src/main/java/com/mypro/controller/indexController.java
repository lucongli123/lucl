package com.mypro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {


	@RequestMapping(value = "/testTz")
	public String index(){
		System.out.print("执行调整页面");
		return "success";
	}
}

