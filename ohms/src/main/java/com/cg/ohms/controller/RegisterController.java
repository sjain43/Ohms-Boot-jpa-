package com.cg.ohms.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cg.ohms.OhmsApplication;
import com.cg.ohms.bean.CustomerDataDTO;
import com.cg.ohms.exception.HMSException;
import com.cg.ohms.service.IRegister;
import com.cg.ohms.utility.ExceptionMessage;

@RestController
public class RegisterController {

	@Autowired
	private IRegister register;
	private static final Logger log = org.slf4j.LoggerFactory.getLogger(OhmsApplication.class);

	public void setRegister(IRegister register) {
		this.register = register;
	}

	@RequestMapping(method = RequestMethod.POST, path = "/Signup", consumes = "application/json", produces = "application/json")
	public String userRegister(@Valid @RequestBody CustomerDataDTO user) throws HMSException {
		//Method for user registration
		log.info("Registration process started");
		int id = register.userRegistration(user);
		if (id == 0) {
			throw new HMSException(ExceptionMessage.USER_MSG);
		} else {
			log.info("Registration process done");
			return "Congratulation for registration Here is your Customer_id " + id;

		}
	}

	@RequestMapping(method = RequestMethod.GET, path = "/Activity", produces = "application/json")
	public List<CustomerDataDTO> Act() throws HMSException {
		//Method for User activity status
		log.info("Activity Check process started:");
		List<CustomerDataDTO> result = register.ActivityCheck();
		if (result != null) {
			log.info("Activity Check process done:");
			return result;
		} else {
			throw new HMSException(ExceptionMessage.ACTIVITY_MSG);
		}

	}

}
