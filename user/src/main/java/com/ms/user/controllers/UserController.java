package com.ms.user.controllers;


import com.ms.user.models.UserModel;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping("/users")
    public ResponseEntity<UserModel> saveUser(@RequestParam @Valid UserRecordDto userRecordDto){

        return ResponseEntity.status(HttpStatus.CREATED).body();
    }



}
