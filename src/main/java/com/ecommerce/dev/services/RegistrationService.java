package com.ecommerce.dev.services;


import com.ecommerce.dev.beans.OrganizationRegistrationRequestDTO;
import com.ecommerce.dev.dao.CompanyDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    @Autowired
    private CompanyDAO companyDAO;

    public boolean saveCompanyRegistrationData(OrganizationRegistrationRequestDTO companyRegistrationRequestData){
        try {
            return companyDAO.saveComapnyregistrationData(companyRegistrationRequestData.getOrganizationEntity());
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }

    }
}
