package com.ecommerce.dev.beans;


import com.ecommerce.dev.entity.CompanyEntity;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CompanyRegistrationRequestData {

    @JsonProperty(value = "request_type")
    private String requestType;
    @JsonProperty(value = "company_registration_data")
    private CompanyEntity companyEntity;

}
