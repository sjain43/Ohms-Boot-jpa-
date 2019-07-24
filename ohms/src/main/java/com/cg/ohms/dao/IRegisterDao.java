package com.cg.ohms.dao;

import java.util.List;

import com.cg.ohms.bean.CustomerDataDTO;

public interface IRegisterDao {
	//Interface for all crud operations

	public int dataInsertion(CustomerDataDTO user);
	public List<CustomerDataDTO> NonActivityList();
}
