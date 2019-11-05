package com.ecommerce.dev.controller;


import com.ecommerce.dev.beans.CompanyRegistrationRequestDTO;
import com.ecommerce.dev.beans.OrganizationRegistrationReponseDTO;
import com.ecommerce.dev.services.RegistrationService;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping
@CrossOrigin
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @Autowired
    private ObjectMapper mapper;

    @PostMapping(value = "/register-organization")
    public JsonNode registerCompany(@Valid @RequestBody CompanyRegistrationRequestDTO companyRegistrationRequestData){
        JsonNode node = mapper.convertValue(
                OrganizationRegistrationReponseDTO.processResponseType(
                        registrationService.saveCompanyRegistrationData(
                                companyRegistrationRequestData)), JsonNode.class);

        return node;
    }
}
