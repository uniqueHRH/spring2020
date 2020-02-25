package com.bit.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bit.rest.service.EmpService;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired
	EmpService service;
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/emp/")
	@ResponseBody
	public List list() {
		return service.list();
	}
		
}



/*
	@ResponseBody
	 - 메소드에 사용할 경우,메소드에서 리턴되는 값은 View 를 통해 출력되지 않고 HTTP Response Body 에 직접 쓰여진다
	 - 쓰여지기 전에 리턴되는 데이터 타입에 따라 MessageConverter 에서 변환이 이뤄진 후 쓰여진다
*/