package com.hcl.mortageloan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.hcl.mortageloan.model.CustomerDetails;
import com.hcl.mortageloan.model.LoanDetails;
import com.hcl.mortageloan.service.ILoanDetailsService;

@RestController
public class LoanDetailsController {

	@Autowired
	ILoanDetailsService iloanservice;
	
	@PostMapping("/createLoan")
	public String createLoan(@RequestBody CustomerDetails customer, @RequestBody LoanDetails loan)
	{
		iloanservice.createLoan(customer, loan);
		return "loan created succussfully";
	}
}
