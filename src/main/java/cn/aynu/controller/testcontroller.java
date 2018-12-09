package cn.aynu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testcontroller {

	@RequestMapping("test.handler")
	public String test() {
		
		return "NewFile.jsp";
	}
	
	
}
