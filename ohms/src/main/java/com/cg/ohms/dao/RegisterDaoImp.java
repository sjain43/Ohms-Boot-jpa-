package com.cg.ohms.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cg.ohms.bean.CustomerDataDTO;

import antlr.collections.List;

@Repository
@Transactional
public class RegisterDaoImp implements IRegisterDao {
	// Implementation class for crud operations
	@PersistenceContext
	private EntityManager entityManager;

	public int dataInsertion(CustomerDataDTO user) {
		// user data insertion into database
		int flag = 0;
		String email = user.getEmail();
		String phone = user.getPhone();
		Query query = entityManager.createNamedQuery("CustomerDataDTO.Duplication_Check");
		query.setParameter("email", email);
		query.setParameter("phone", phone);
		long num = (long) query.getSingleResult();
		if (num == 0) {
			entityManager.persist(user);
			return user.getcustomerid();
		} else {
			return flag;
		}

	}

	@Override
	public java.util.List<CustomerDataDTO> NonActivityList() {
		// Activity of user check
		TypedQuery<CustomerDataDTO> query = entityManager.createQuery(
				"SELECT cust from CustomerDataDTO cust where cust.customerid not in(select distinct book.customerid from BookingDetailsDTO book)",
				CustomerDataDTO.class);
		java.util.List<CustomerDataDTO> results = query.getResultList();
		return results;
	}

}
