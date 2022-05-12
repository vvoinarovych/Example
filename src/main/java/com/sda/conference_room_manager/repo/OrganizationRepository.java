package com.sda.conference_room_manager.repo;

import com.sda.conference_room_manager.entity.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationRepository extends JpaRepository<Organization, Integer> {
    void deleteOrganizationById(Integer id);
}
