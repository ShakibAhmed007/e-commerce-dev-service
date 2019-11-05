package com.ecommerce.dev.beans;


import com.ecommerce.dev.entity.OrganizationEntity;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CompanyRegistrationRequestDTO {

    @JsonProperty(value = "request_type")
    private String requestType;
    @JsonProperty(value = "organization_registration_data")
    private OrganizationEntity organizationEntity;

}
