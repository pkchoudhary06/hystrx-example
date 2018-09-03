package com.thoughtmechanix.organization.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thoughtmechanix.organization.model.Organization;

@Repository
public interface OrganizationRepository extends JpaRepository<Organization,String>  {
	
}
