package com.vijay.securityjpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.*;

@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {


    private String name;


    private String email;


    private String password;

    private String gender;


    private String about;


    private String imageName;

    private String roles;
}
