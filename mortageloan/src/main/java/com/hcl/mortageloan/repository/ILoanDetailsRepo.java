package com.hcl.mortageloan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hcl.mortageloan.model.LoanDetails;

@Repository
public interface ILoanDetailsRepo extends JpaRepository<LoanDetails, Integer>{

}
