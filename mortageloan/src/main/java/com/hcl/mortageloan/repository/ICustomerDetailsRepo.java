package com.hcl.mortageloan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hcl.mortageloan.model.CustomerDetails;

@Repository
public interface ICustomerDetailsRepo extends JpaRepository<CustomerDetails, Integer>{

}
