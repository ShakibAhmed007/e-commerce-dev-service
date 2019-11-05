package com.ecommerce.dev.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="organization")
public class OrganizationEntity {

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Column(name="ORG_ID")
    private Long orgId;
    @Column(name="ORG_EMAIL")
    private String orgEmail;
    @Column(name="ORG_PASSWORD")
    private String orgPassword;
    @Column(name="ORG_NAME")
    private String orgName;
    @Column(name="ORG_TYPE")
    private String orgType;
    @Column(name="ORG_ADDRESS")
    private String orgAddress;
    @Column(name="ORG_CONTACT_NUMBER")
    private String orgContactNumber;


}
