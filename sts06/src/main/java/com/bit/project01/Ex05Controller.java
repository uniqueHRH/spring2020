package com.bit.project01;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller   //기존에는 bean 객체로 만들어, handlingMapping 클래스에 연결 및 수행시켰다
public class Ex05Controller {

	@RequestMapping("/ex05")
	public String func01(Model model, HttpSession session) {
		System.out.println("model : "+model);
		System.out.println("session : "+session);
		return "home";
	}
	
	
	@RequestMapping("/ex06")
	public String func02(Model model) {
		model.addAttribute("serverTime","page ex06");
		return "home";
	}
	
}



/*
	인자의 순서에 관계없이 인자를 받을 수 있다
	Controller 를 통해 페이지를 구현 / @RequestMapping 을 통해 view 위임
	
	 - class 명, 메소드명, 인자갯수 다 내마음대로 (어노테이션만 잘 만들어내면 됨)
	 - 자바코드로 FRAMEWORK 를 구현하고 있다
*/