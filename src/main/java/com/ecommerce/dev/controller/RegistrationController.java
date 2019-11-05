package com.ecommerce.dev.controller;


import com.ecommerce.dev.beans.CompanyRegistrationRequestDTO;
import com.ecommerce.dev.services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping
@CrossOrigin
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @PostMapping(value = "/register-organization")
    public String registerCompany(@Valid @RequestBody CompanyRegistrationRequestDTO companyRegistrationRequestData){
        return registrationService.saveCompanyRegistrationData(companyRegistrationRequestData);
    }
}
