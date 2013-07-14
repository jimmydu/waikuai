package com.waikuai.userManage.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.waikuai.userManage.dao.LoginDao;
import com.waikuai.util.LogUtil;

@Repository
public class LoginDaoImpl implements LoginDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	@Override
	public boolean validate(String userName, String pwd) {
		LogUtil.getLogger().info(
				"calling LoginDao.validate(" + userName + "," + pwd + ");");
		return false;
	}

}
