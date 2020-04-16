package com.findyourhustle.management.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User extends BaseEntity{

    private String userName;

    private String email;

    private String password;
}
