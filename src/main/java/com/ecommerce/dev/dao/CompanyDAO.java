package com.ecommerce.dev.dao;

import com.ecommerce.dev.entity.OrganizationEntity;
import com.ecommerce.dev.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyDAO {

    @Autowired
    private CompanyRepository companyRepository;


    public String saveComapnyregistrationData(OrganizationEntity companyEntity) throws Exception {
        if(companyRepository != null) {
            companyRepository.save(companyEntity);
        }
        return "Succesfully Saved";
    }
}
