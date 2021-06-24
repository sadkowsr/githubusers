package org.sadkowski.github.controller;

import org.sadkowski.github.dto.UserDTO;
import org.sadkowski.github.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{login}")
    public ResponseEntity<UserDTO> getUsers(@PathVariable("login") final String login){
        return new ResponseEntity<>(userService.getUser(login), HttpStatus.OK);
    }

}
