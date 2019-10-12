package com.ecommerce.dev.controller;


import com.ecommerce.dev.beans.CompanyRegistrationRequestData;
import com.ecommerce.dev.services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping
@CrossOrigin
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @PostMapping(value = "/register-company")
    public String registerCompany(@Valid @RequestBody CompanyRegistrationRequestData companyRegistrationRequestData){
        System.out.println(companyRegistrationRequestData);
        return registrationService.saveCompanyRegistrationData(companyRegistrationRequestData);
    }
}
