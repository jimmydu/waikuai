package com.waikuai.userManage.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.waikuai.userManage.dao.LoginDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:test_applicationContext.xml" })
public class LoginServiceImplTest {

	@Autowired
	LoginDao loginDao;
	
	@Test
	public void testValidate() {
		assert(loginDao != null);
	}

}
