package com.cg.ohms.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.GeneratorType;

/**
 * User data dto class
 * 
 * @author trainee
 *
 */
@Entity
@Table(name = "customer")
@NamedQuery(name = "CustomerDataDTO.Duplication_Check", query = "SELECT count(*) FROM CustomerDataDTO cust WHERE cust.email = :email OR cust.phone = :phone")
public class CustomerDataDTO {
	// All the attributes for getting user-data input
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CUSTOMER_ID_GENERATE")
	@SequenceGenerator(name="CUSTOMER_ID_GENERATE", sequenceName="CUSTOMER_ID_GENERATE", allocationSize=1)
    private int customerid;
    
	@NotEmpty(message = "first name must not be empty")
	@Column(name = "first_name")
	private String firstname;
    
	@NotEmpty(message = "last name must not be empty")
	@Column(name = "last_name")
	private String lastname;
    
	@NotEmpty(message = "password must not be empty")
	private String password;
	
	@NotEmpty(message = "email must not be empty")
	private String email;
	
	@NotEmpty(message = "phone must not be empty")
	private String phone;
	
	@NotEmpty(message = "state must not be empty")
	private String state;
	
	@NotEmpty(message = "city must not be empty")
	private String city;
	
	private int pincode;
	
	@NotEmpty(message = "homeno. must not be empty")
	private String homeno;


	@Override
	public String toString() {
		return "CustomerDataDTO [customerid=" + customerid + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", password=" + password + ", email=" + email + ", phone=" + phone + ", state=" + state + ", city="
				+ city + ", pincode=" + pincode + ", homeno=" + homeno + "]";
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public void setHomeno(String homeno) {
		this.homeno = homeno;
	}

	public String getState() {
		return state;
	}

	public String getCity() {
		return city;
	}

	public int getPincode() {
		return pincode;
	}

	public String getHomeno() {
		return homeno;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}
	public int getcustomerid() {
		return customerid;
	}

}
