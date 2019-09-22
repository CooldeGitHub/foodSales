package com.zjsru.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zjsru.bean.Manager;
import com.zjsru.mapper.ManagerDao;
@Service
public class ManagerServiceImpl implements ManagerService{
	@Autowired
	private ManagerDao managerDao;
	
	@Override
	public Manager findById(int id) {
		// TODO Auto-generated method stub
		Manager manager = managerDao.selectById(id);
		return manager;
	}

	@Override
	public Manager checkLogin(int id, String password) {
		// TODO Auto-generated method stub
		Manager manager = managerDao.selectById(id);
		if (manager != null && manager.getId()==id && manager.getPassword().equals(password)) {
			return manager;
		}
		return null;
	}

	@Override
	public void Regist(Manager manager) {
		// TODO Auto-generated method stub
		managerDao.registManager(manager.getId(), manager.getPassword());
	}

}
