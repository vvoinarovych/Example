package com.sda.conference_room_manager.service;

import com.sda.conference_room_manager.entity.Organization;
import com.sda.conference_room_manager.repo.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrganizationService {

    private final OrganizationRepository repository;

    @Autowired
    public OrganizationService(OrganizationRepository repository) {
        this.repository = repository;
    }

    public Organization saveOrganization(Organization organization){
        return repository.save(organization);
    }

    public List<Organization> getALlOrganizations() {
        return repository.findAll();
    }

    public Organization getOrganizationById(int id) {
        return repository.getById(id);
    }

    public Organization updateOrganization(Organization organization){
        return repository.save(organization);
    }

    public void deleteOrganizationById(Integer id){
        repository.deleteOrganizationById(id);
    }
}
