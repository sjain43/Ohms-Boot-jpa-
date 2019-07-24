package com.cg.ohms.service;

import java.util.List;

import com.cg.ohms.bean.CustomerDataDTO;

/**
 * Interface declaration
 * 
 * @author trainee
 *
 */
public interface IRegister {
//Interface for user registration 

	int userRegistration(CustomerDataDTO user);
	
	List<CustomerDataDTO> ActivityCheck();
}
