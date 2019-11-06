package com.hq.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hq.service.UserService;

@Controller
public class UserController {
	
	@Resource
	private UserService userService;
	
	@RequestMapping("list.do")
	public String list(Model model) {
		List list=userService.list();
		System.out.println(list);
		model.addAttribute("list", list);
		return "list";
	}
}
