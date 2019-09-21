package com.zjsru.mapper;

import java.util.List;

import com.zjsru.bean.Address;

public interface AddressDao {
	void insertAddress(Address address);

	void deleteAddress(int cid);

	void updateAddress(Address address);
	
	Address selectByName(String name);

	List<Address> selectAllAddress();

	Address selectAddress(int aid);
}
