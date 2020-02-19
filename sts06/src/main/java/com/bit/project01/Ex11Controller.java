package com.bit.project01;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Ex11Controller {

	@RequestMapping("/ex11")
	public String ex11(@ModelAttribute("msg") String msg) {   // 인자가 같으면 생략 가능 (@RequestParam("id") String id) or (@RequestParam String id) / id, pw 같이 다를 경우 각각 적어줘야 한다
		System.out.println(msg);
		return "ex11";
	}
	
	@RequestMapping("/ex12/{1}/{2}")
	public String ex12(@PathVariable("1") String id, @PathVariable("2") String pw) {
		System.out.println(id);
		System.out.println(pw);
		return "ex11";
	}
	
}

/*
	근래들어 많이 사용하는 패턴
	 - 1, 2 로 출력되는 순서를 정한다
	 
	 
	@RequuestMapping("/ex12/{id}")
	public String ex12(@PathVariable String id) {
		System.out.println(id);
		return "ex11";
	}
	의 경우, 인자가 id 하나이므로 @PathVariable 어노테이션 생략이 가능하다
*/