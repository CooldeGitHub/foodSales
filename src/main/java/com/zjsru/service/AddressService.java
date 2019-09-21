package com.zjsru.service;

import java.util.List;

import com.zjsru.bean.Address;

public interface AddressService {
	void addAddress(Address address);

	void deleteAddress(int cid);

	void updateAddress(Address address);
	
	Address findByName(String name);

	List<Address> findAllAddress();

	Address findAddress(int aid);
}
