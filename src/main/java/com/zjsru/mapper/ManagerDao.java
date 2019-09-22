package com.zjsru.mapper;

import org.apache.ibatis.annotations.Param;

import com.zjsru.bean.Manager;

public interface ManagerDao {
	Manager selectById(int id);
	void registManager(@Param("id")int uid,
  		@Param("password")String password);
}
