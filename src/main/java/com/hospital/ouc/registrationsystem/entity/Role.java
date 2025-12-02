package com.hospital.ouc.registrationsystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

@Entity
@Table(name = "roles") // 在数据库建对应表
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Role_id;

    @Enumerated(EnumType.STRING)
    @Column(length = 50)
    private ERole Role_name;

    public Role() {

    }

    public Role(ERole name) {
        this.Role_name = name;
    }

}
