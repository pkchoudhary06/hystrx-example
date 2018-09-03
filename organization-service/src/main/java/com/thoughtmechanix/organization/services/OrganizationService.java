package com.thoughtmechanix.organization.services;

import com.thoughtmechanix.organization.model.Organization;
import com.thoughtmechanix.organization.repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class OrganizationService {
    
	@Autowired
    private OrganizationRepository orgRepository;
	
	public List<Organization> getAllOrg(){
		return orgRepository.findAll();
	}

    public Organization getOrg(String organizationId) {
        return orgRepository.findById(organizationId).get();
    }

    public void saveOrg(Organization org){
        org.setId( UUID.randomUUID().toString());
        orgRepository.save(org);

    }

    public void updateOrg(Organization org){
        orgRepository.save(org);
    }

    public void deleteOrg(Organization org){
    	orgRepository.delete(org);
    }
}
