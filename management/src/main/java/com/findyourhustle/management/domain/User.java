package com.findyourhustle.management.domain;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class User extends BaseEntity{

    @Column(name = "user_name")
    private String userName;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;
}
