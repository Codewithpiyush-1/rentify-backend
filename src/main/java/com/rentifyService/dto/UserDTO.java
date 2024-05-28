package com.rentifyService.dto;

import com.rentifyService.entity.UserRole;
import lombok.Data;

@Data
public class UserDTO {
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String password;
    private UserRole role;
}
