package com.ecommerce.dev.services;


import com.ecommerce.dev.beans.CompanyRegistrationRequestDTO;
import com.ecommerce.dev.dao.CompanyDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    @Autowired
    private CompanyDAO companyDAO;

    public String saveCompanyRegistrationData(CompanyRegistrationRequestDTO companyRegistrationRequestData){
        try {
            return companyDAO.saveComapnyregistrationData(companyRegistrationRequestData.getOrganizationEntity());
        }catch(Exception e){
            e.printStackTrace();
            return e.toString();
        }

    }
}
