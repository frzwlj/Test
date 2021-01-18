package com.jt.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.jt.pojo.User;
import com.jt.service.UserService;

@Controller
public class UserController {

	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/findAll")
	public String findAll(Model model) {
		
		List<User> uList=userService.findAll();
		model.addAttribute("userList", uList);
		
		return "userList";
	}
	
	@RequestMapping("/ajax")
	public String ajax(Model model) {
		
		List<User> uList=userService.findAll();
		model.addAttribute("userList", uList);
		
		return "ajax";
	}
	
	@RequestMapping("/findAjax")
	public List<User> findAjax() {
		return userService.findAll();
	}
	
	
	
	
	
	
	
	
	
	
}
