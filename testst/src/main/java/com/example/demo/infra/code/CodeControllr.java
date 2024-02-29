package com.example.demo.infra.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CodeControllr {

	@Autowired
	CodeService service;
	
	@RequestMapping(value = "/codeXdmList")
	
	/* 애매 */
	public String codeXdmList(Model model) throws Exception{
		
		model.addAttribute("list", service.selectList());
		
		System.out.println("--------------");
		System.out.println(model.toString());
		
		return "codeXdmList";
	}
}
