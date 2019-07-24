package com.cg.ohms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ohms.bean.CustomerDataDTO;
import com.cg.ohms.dao.IRegisterDao;
import com.cg.ohms.service.IRegister;

@Service
public class RegisterImpl implements IRegister {
	//Interface implementation class for user registration
	@Autowired
	IRegisterDao registerdao;

	public void setRegisterdao(IRegisterDao registerdao) {
		this.registerdao = registerdao;
	}

	public int userRegistration(CustomerDataDTO user) {
		int userid = registerdao.dataInsertion(user);

		return userid;
	}

	@Override
	public List<CustomerDataDTO> ActivityCheck() {
		
		return registerdao.NonActivityList();
		
	}

}
