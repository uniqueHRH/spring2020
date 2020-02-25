package com.bit.prj03.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bit.prj03.model.entity.EmpVo;
import com.bit.prj03.service.EmpService;

//controller : 서비스를 결정하고, view 를 결정한다
//서비스가 없을 때에는, view 만 결정한다
//EmpService 가 서비스를 동작한다

@Controller
public class EmpController {
	@Autowired
	EmpService empService;

	@RequestMapping("/emp/list")
	public String list(Model model){
		empService.list(model);
		return "empList";
	}
	
	@RequestMapping(value = "/emp/add",method=RequestMethod.GET)
	public String add() {return "empAdd";}
	
//	Java Bean 규칙 (getter, setter, 생성자) 에 맞는 객체는 parameter 전달이 자동으로 가능함
//	전달받은 파라미터를 model 에 담아서 강제 전달하도록 한다
	@RequestMapping(value = "/emp/add",method=RequestMethod.POST)
	public String add(@ModelAttribute EmpVo bean){
		empService.insert(bean);
		return "redirect:list"; 
	}
	
	@RequestMapping("/emp/detail/{idx}")
	public String detail(Model model,@PathVariable("idx") int sabun){   // @PathVariable : url 의 구분자에 들어오는 값을 처리할 때 사용한다
		empService.detail(model, sabun);
		return "empOne";
	}
	
	@RequestMapping(value = "/emp/edit",method = RequestMethod.POST)
	public String edit(@ModelAttribute EmpVo bean){
		empService.update(bean);
		return "redirect:detail/"+bean.getSabun();
	}
	
	@RequestMapping(value="/emp/delete",method=RequestMethod.POST)
	public String delete(int sabun){
		empService.delete(sabun);
		return "home";
	}
}

