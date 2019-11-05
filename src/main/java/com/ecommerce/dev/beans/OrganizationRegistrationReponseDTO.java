package com.ecommerce.dev.beans;

public class OrganizationRegistrationReponseDTO extends ResponseData {

    public static synchronized OrganizationRegistrationReponseDTO processResponseType(boolean isSuccess){
        if(isSuccess){
            return success();
        }else{
            return error();
        }
    }

    public static synchronized OrganizationRegistrationReponseDTO success(){
        OrganizationRegistrationReponseDTO organizationRegistrationReponseDTO = new OrganizationRegistrationReponseDTO();
        organizationRegistrationReponseDTO.setStatus(true);
        organizationRegistrationReponseDTO.setResponseCode("00");
        organizationRegistrationReponseDTO.setResponseType("ORGANIZATION_REGISTRATION_RESPONSE");
        organizationRegistrationReponseDTO.setMessage("Successfully Saved !!!");

        return organizationRegistrationReponseDTO;
    }


    public static synchronized OrganizationRegistrationReponseDTO error(){
        OrganizationRegistrationReponseDTO organizationRegistrationReponseDTO = new OrganizationRegistrationReponseDTO();
        organizationRegistrationReponseDTO.setStatus(true);
        organizationRegistrationReponseDTO.setResponseCode("03");
        organizationRegistrationReponseDTO.setResponseType("ORGANIZATION_REGISTRATION_RESPONSE");
        organizationRegistrationReponseDTO.setMessage("Error Occured !!!");

        return organizationRegistrationReponseDTO;
    }
}
