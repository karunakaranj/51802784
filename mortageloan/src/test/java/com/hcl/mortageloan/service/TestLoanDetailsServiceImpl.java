package com.hcl.mortageloan.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.hcl.mortageloan.model.CustomerDetails;
import com.hcl.mortageloan.model.LoanDetails;
import com.hcl.mortageloan.repository.ICustomerDetailsRepo;
import com.hcl.mortageloan.repository.ILoanDetailsRepo;
import com.hcl.mortageloan.serviceimpl.LoanDetailsServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class TestLoanDetailsServiceImpl {

	@InjectMocks
	LoanDetailsServiceImpl loanserviceimpl;
	
	@Mock
	ICustomerDetailsRepo  icustrepo;
	
	@Mock
	ILoanDetailsRepo iloanrepo;
	
	@Test
	public void createLoan() 
	{
		int custAge = 123;
		int loanAmount = 22000;
		CustomerDetails customer = new CustomerDetails();
		LoanDetails loandetails = new LoanDetails();
		customer.setCustAge(custAge);
		loandetails.setLoanAmount(loanAmount);
		Mockito.when(icustrepo.save(Mockito.anyObject())).thenReturn(customer);
		Mockito.when(iloanrepo.save(Mockito.anyObject())).thenReturn(loandetails);
		assertEquals(custAge, customer.getCustAge());
		
		
		
	}
	
}
