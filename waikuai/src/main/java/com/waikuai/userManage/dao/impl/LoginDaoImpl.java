package com.waikuai.userManage.dao.impl;

import org.springframework.stereotype.Repository;

import com.waikuai.userManage.dao.LoginDao;
import com.waikuai.util.LogUtil;

@Repository
public class LoginDaoImpl implements LoginDao {
	@Override
	public boolean validate(String userName, String pwd) {
		LogUtil.getLogger().info(
				"calling LoginDao.validate(" + userName + "," + pwd + ");");
		return false;
	}

}
