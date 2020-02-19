package com.bit.project01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Ex13Controller {

	@RequestMapping("/ex13")
	public void ex13() {
		
	}
	
	
	
	@RequestMapping(value="/ex14",method=RequestMethod.POST)   // jsp 에서 method 를 POST 로 제한했기 때문에 / 제한하지 않고, default 는 모두 허용한다
	public void ex14(String id) {
		System.out.println(id);
	}
}
