package com.waikuai.content.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.waikuai.userManage.beans.User;
import com.waikuai.userManage.service.LoginService;

@RequestMapping("/content")
@Controller
public class ContentController {
	@Autowired
	private LoginService loginService;

	@RequestMapping("/getMsg/{userName}/{pwd}")
	@ResponseBody
	public User getMsg(@PathVariable("userName") String userName,
			@PathVariable("pwd") String pwd, Model m) {

		return null;
	}
}
