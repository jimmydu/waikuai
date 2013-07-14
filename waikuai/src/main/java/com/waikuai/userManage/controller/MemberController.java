package com.waikuai.userManage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.waikuai.userManage.beans.User;
import com.waikuai.userManage.service.LoginService;

@RequestMapping("/member")
@Controller
public class MemberController {
	@Autowired
	private LoginService loginService;

	@RequestMapping("/doLogin/{userName}/{pwd}")
	@ResponseBody
	public User doLogin(@PathVariable("userName") String userName,
			@PathVariable("pwd") String pwd, Model m) {

		User testUser = new User();
		testUser.setUserName(userName);
		testUser.setPwd(pwd);
		testUser.setId("007");

		if (loginService.validate(userName, pwd)) {
			m.addAttribute("result", "1");
			return testUser;
		} else {
			m.addAttribute("result", "-1");
			return testUser;
		}

	}
}
