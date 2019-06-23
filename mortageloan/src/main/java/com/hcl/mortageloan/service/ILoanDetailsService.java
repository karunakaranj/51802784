package com.hcl.mortageloan.service;

import com.hcl.mortageloan.model.CustomerDetails;
import com.hcl.mortageloan.model.LoanDetails;

public interface ILoanDetailsService {

	public String createLoan(CustomerDetails customer, LoanDetails loandetails);
}
