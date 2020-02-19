package com.bit.project01;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Ex04Controller {

	@RequestMapping("/ex04")
	public String func(Model model) {
		model.addAttribute("serverTime", "ex04 page");
		return "home";
	}
}


/*
	Model : controller 에서 생성한 데이터를 담아서 view 로 전달할 때 사용하는 객체 

*/