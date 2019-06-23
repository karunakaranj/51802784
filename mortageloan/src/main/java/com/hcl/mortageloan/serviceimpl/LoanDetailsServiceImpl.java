package com.hcl.mortageloan.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.hcl.mortageloan.model.CustomerDetails;
import com.hcl.mortageloan.model.LoanDetails;
import com.hcl.mortageloan.repository.ICustomerDetailsRepo;
import com.hcl.mortageloan.repository.ILoanDetailsRepo;
import com.hcl.mortageloan.service.ILoanDetailsService;

public class LoanDetailsServiceImpl implements ILoanDetailsService {

	@Autowired
	ILoanDetailsRepo iloanrepo;
	@Autowired
	ICustomerDetailsRepo icustrepo;
	
	@Override
	public String createLoan(CustomerDetails customer, LoanDetails loandetails) {
		if(loandetails.getLoanAmount()==2*(loandetails.getSecurityAmount()))
		{
			if(customer.getCustCreditScore()>600&&(customer.getCustAge()>24||customer.getCustAge()<60))
			{
				customer.setCustAge(customer.getCustAge());
				customer.setCustGender(customer.getCustGender());
				customer.setCustCreditScore(customer.getCustCreditScore());
				customer.setCustName(customer.getCustName());
				customer.setCustMaritalStatus(customer.getCustMaritalStatus());
				icustrepo.save(customer);
			}
			loandetails.setLoanAccountNumber(loandetails.getLoanAccountNumber());
			loandetails.setLoanAmount(loandetails.getLoanAmount());
			loandetails.setSecurityaddress(loandetails.getSecurityaddress());
			loandetails.setSecurityAmount(loandetails.getSecurityAmount());
			loandetails.setLoanStatus(true);
			iloanrepo.save(loandetails);
			return "loan successfully created";
		}
		return "loan not created";
	}

}
