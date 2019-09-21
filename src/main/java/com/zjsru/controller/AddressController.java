package com.zjsru.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zjsru.bean.Address;
import com.zjsru.service.AddressService;

@Controller
@RequestMapping("/address")
public class AddressController {
	@Autowired
	private AddressService addressService;

	@RequestMapping(value = "/findAllAddress", method = RequestMethod.GET)
	@ResponseBody
	public List findAllAddress(Model model) {
		List<Address> addresses = addressService.findAllAddress();
		model.addAttribute("address", addresses);
		for (Address address : addresses) {
			System.out.print(address.toString());
		}
		return addresses;
	}
	@RequestMapping(value = "/addressManage", method = RequestMethod.GET)
	public String addressManage() {
		return "addressmanage.html";
	}
	
	
	@RequestMapping(value = "/addAddress", method = RequestMethod.POST)
	public String addAddress(HttpServletRequest req, Model model) throws UnsupportedEncodingException {
		req.setCharacterEncoding("UTF-8");
		Address address = new Address();
		address.setAid(Integer.parseInt(req.getParameter("aid")));
		address.setName(req.getParameter("name"));
		address.setUid(Integer.parseInt(req.getParameter("uid")));
		address.setPhone(req.getParameter("phone"));
		address.setDetail(req.getParameter("detail"));
		addressService.addAddress(address);
		return "redirect:/jsp/addressmanage.html";
	}

	@RequestMapping(value = "/delete")
	public String deleteAddress(HttpServletRequest req, Model model) {
		addressService.deleteAddress(Integer.parseInt(req.getParameter("aid")));
		return "redirect:/jsp/addressmanage.html";
	}

	
	@RequestMapping(value = "/updateAddress", method = RequestMethod.POST)
	public String updateAddress(HttpServletRequest req, Model model) throws UnsupportedEncodingException {
		req.setCharacterEncoding("UTF-8");
		Address address = new Address();
		address.setAid(Integer.parseInt(req.getParameter("aid")));
		address.setName(req.getParameter("name"));
		address.setPhone(req.getParameter("phone"));
		address.setDetail(req.getParameter("detail"));
		System.out.print(address.toString());
		addressService.updateAddress(address);
		return "redirect:/jsp/addressmanage.html";
	}



	@RequestMapping(value = "/findAddress", method = RequestMethod.GET)
	@ResponseBody
	public Address findAddress(HttpServletRequest request){
		int aid = Integer.parseInt(request.getParameter("aid"));
		return addressService.findAddress(aid);
	}
}
