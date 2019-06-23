package com.hcl.mortageloan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hcl.mortageloan.model.BankOfficerDetails;

@Repository
public interface IBankOfficerDetailsRepo extends JpaRepository<BankOfficerDetails, Integer>{

}
