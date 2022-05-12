package com.sda.conference_room_manager.rest;
import com.sda.conference_room_manager.entity.Organization;
import com.sda.conference_room_manager.service.OrganizationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/organization")
public class OrganizationController {

    private final OrganizationService organizationService;

    public OrganizationController(OrganizationService organizationService) {
        this.organizationService = organizationService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Organization>> getAllOrganizations () {
        List<Organization> organizations = organizationService.getALlOrganizations();
        return new ResponseEntity<>(organizations, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Organization> getOrganizationById (@PathVariable("id") Integer id) {
        Organization organization = organizationService.getOrganizationById(id);
        return new ResponseEntity<>(organization, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Organization> addOrganization(@RequestBody Organization organization) {
        Organization newOrganization = organizationService.saveOrganization(organization);
        return new ResponseEntity<>(newOrganization, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Organization> updateOrganization(@RequestBody Organization organization) {
        Organization updateOrganization = organizationService.updateOrganization(organization);
        return new ResponseEntity<>(updateOrganization, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable("id") Integer id) {
        organizationService.deleteOrganizationById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
