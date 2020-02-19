package com.bit.project01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Ex03Controller {

	@RequestMapping("/ex03")
	public String func() {
		return "home";
	}
}
