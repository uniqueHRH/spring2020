package com.bit.project01;

import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.View;

@Controller
@RequestMapping("/ex/")
public class Ex10Controller {

	@RequestMapping("/ex01")
	public String ex10() {
		return "home";
	}
}

/*
	@RequestMapping : �޼ҵ�� �ʼ� , Ŭ������ ����
	 - Ŭ������ ���, namespace �� ���� ������ �Ѵ�
*/