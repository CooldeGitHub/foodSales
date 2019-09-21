package com.zjsru.mapper;

import org.apache.ibatis.annotations.Param;

import com.zjsru.bean.User;

public interface UserDao {
	User selectByUid(int uid);
	void registUser(@Param("uid")int uid,@Param("uname")String uname,
  		@Param("password")String password);
}
