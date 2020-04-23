package com.findyourhustle.management.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Data
public class User {
//        extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;
}
