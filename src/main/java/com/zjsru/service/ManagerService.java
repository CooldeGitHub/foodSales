package com.zjsru.service;

import com.zjsru.bean.Manager;

public interface ManagerService {
	Manager findById(int id);

	Manager checkLogin(int id, String password);

	void Regist(Manager manager);
}
