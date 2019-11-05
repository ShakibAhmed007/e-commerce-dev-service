package com.ecommerce.dev.repository;

import com.ecommerce.dev.entity.OrganizationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<OrganizationEntity, Long> {

}
