package com.waikuai.userManage.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.waikuai.userManage.dao.LoginDao;
import com.waikuai.userManage.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginDao loginDao;

	@Override
	public boolean validate(String userName, String pwd) {
		return loginDao.validate(userName, pwd);
	}

}
