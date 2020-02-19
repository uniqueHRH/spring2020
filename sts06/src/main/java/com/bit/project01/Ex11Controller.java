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
	public String ex11(@ModelAttribute("msg") String msg) {   // ���ڰ� ������ ���� ���� (@RequestParam("id") String id) or (@RequestParam String id) / id, pw ���� �ٸ� ��� ���� ������� �Ѵ�
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
	�ٷ���� ���� ����ϴ� ����
	 - 1, 2 �� ��µǴ� ������ ���Ѵ�
	 
	 
	@RequuestMapping("/ex12/{id}")
	public String ex12(@PathVariable String id) {
		System.out.println(id);
		return "ex11";
	}
	�� ���, ���ڰ� id �ϳ��̹Ƿ� @PathVariable ������̼� ������ �����ϴ�
*/