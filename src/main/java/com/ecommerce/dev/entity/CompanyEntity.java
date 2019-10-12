package com.ecommerce.dev.entity;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="company")
public class CompanyEntity {

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Column(name="company_id")
    private Long companyId;
    @Column(name="email")
    private String email;
    @Column(name="password")
    private String password;
    @Column(name="company_name")
    private String companyName;
    @Column(name="contact_number")
    private String contactNumber;
    @Column(name="company_type")
    private String companyType;


}
