package com.example.cmssb.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserDTO {
    private String name;
    private String email;
    private String username;
    private String password;
    private String type;
}
