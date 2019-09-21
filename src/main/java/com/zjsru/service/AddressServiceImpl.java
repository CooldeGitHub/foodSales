package com.zjsru.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zjsru.bean.Address;
import com.zjsru.mapper.AddressDao;

@Service
public class AddressServiceImpl implements AddressService{
	@Autowired
	private AddressDao addressDao;
	
	@Override
	public void addAddress(Address address) {
		// TODO Auto-generated method stub
		addressDao.insertAddress(address);
	}

	@Override
	public void deleteAddress(int cid) {
		// TODO Auto-generated method stub
		addressDao.deleteAddress(cid);
	}

	@Override
	public void updateAddress(Address address) {
		// TODO Auto-generated method stub
		addressDao.updateAddress(address);
	}
	
	@Override
	public Address findByName(String name) {
		// TODO Auto-generated method stub
		Address address = addressDao.selectByName(name);
		return address;
	} 
	
	@Override
	public List<Address> findAllAddress() {
		// TODO Auto-generated method stub
		List<Address> addresses = addressDao.selectAllAddress();
		return addresses;
	}

	@Override
	public Address findAddress(int aid) {
		return addressDao.selectAddress(aid);
	}

}
