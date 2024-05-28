package com.rentifyService.service;

import com.rentifyService.dto.UserDTO;
import com.rentifyService.entity.User;
import com.rentifyService.repository.UserRepository;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User getUserByUsername(String firstName) {
        return userRepository.findByFirstName(firstName);
    }



    public void registerUser(UserDTO userDTO) {
        // Convert UserDTO to User entity
        User user = new User();
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        user.setEmail(userDTO.getEmail());
        user.setPhoneNumber(userDTO.getPhoneNumber());
        user.setPassword(userDTO.getPassword());
        user.setRole(userDTO.getRole());
        userRepository.save(user);
    }




}
