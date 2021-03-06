package br.com.socialmeli.controllers;

import br.com.socialmeli.dtos.UserDTO;
import br.com.socialmeli.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/system/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity createUser(@RequestBody UserDTO userDTO){
        return userService.insertUser(userDTO);
    }

    @GetMapping
    public ResponseEntity listUser(){
        return userService.listUser();
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity deleteUser(@PathVariable Integer userId){
        return userService.deleteUser(userId);
    }
}
