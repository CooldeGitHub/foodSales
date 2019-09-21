package com.zjsru.service;

import com.zjsru.bean.User;

public interface UserService {
	User findByUid(int uid);

	User checkLogin(int uid, String uname, String password);

	void Regist(User user);
}
