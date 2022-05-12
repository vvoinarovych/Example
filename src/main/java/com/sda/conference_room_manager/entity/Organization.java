package com.sda.conference_room_manager.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "organizations")
@Builder(setterPrefix = "with")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Organization {

    @Id
    @GeneratedValue
    private int id;

    @Column(unique = true, nullable = false)
    private String name;

    private String email;

}
