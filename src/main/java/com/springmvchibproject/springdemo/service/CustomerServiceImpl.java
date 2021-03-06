package com.springmvchibproject.springdemo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvchibproject.springdemo.dao.CustomerDAO;
import com.springmvchibproject.springdemo.entity.Customer;
@Service
public class CustomerServiceImpl implements CustomerService {
@Autowired	
private CustomerDAO customerDAO;
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		// TODO Auto-generated method stub
		List<Customer> customers = customerDAO.getCustomers();
		return customers;
	}
	@Override
	@Transactional
	public void saveCustomer(Customer theCustomer) {
		// TODO Auto-generated method stub
		customerDAO.saveCustomer(theCustomer);
		
	}
	@Override
	@Transactional
	public Customer getCustomer(int theId) {
		// TODO Auto-generated method stub
		return customerDAO.getCustomers(theId);
	}
	@Override
	@Transactional
	public void deleteCustomer(int theId) {
		// TODO Auto-generated method stub
		customerDAO.deleteCustomer(theId);
	}
	@Override
	@Transactional
	public List<Customer> searchCustomers(String theName) {
		// TODO Auto-generated method stub
		return customerDAO.getCustomers(theName);
	}

}
