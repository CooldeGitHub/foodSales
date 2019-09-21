package com.zjsru.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zjsru.bean.User;
import com.zjsru.mapper.UserDao;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public User findByUid(int uid) {
		// TODO Auto-generated method stub
		User user = userDao.selectByUid(uid);
		return user;
	}

	@Override
	public User checkLogin(int uid, String uname, String password) {
		// TODO Auto-generated method stub
		User user = userDao.selectByUid(uid);
		if (user != null && user.getUname().equals(uname) && user.getPassword().equals(password)) {
			return user;
		}
		return null;
	}

	@Override
	public void Regist(User user) {
		// TODO Auto-generated method stub
		userDao.registUser(user.getUid(), user.getUname(), user.getPassword());
	}

}
