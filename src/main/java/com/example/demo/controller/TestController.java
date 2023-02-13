package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@RestController
@RequestMapping("/validate")
@Validated
public class TestController {
    @GetMapping(value = "/ping", produces = MediaType.ALL_VALUE)
    public String testApplication() {
        return "pong";
    }

    @PostMapping("/requestbody")
    public String validateRequestBody(@Valid @RequestBody User user) {
        return "User Validation, All Pass !!";
    }

    @GetMapping("/valid-name/{name}")
//    public String createUsername(@PathVariable("name") @Valid @Pattern(regexp = "^[a-zA-Z]*$",message = "username should contain alphabet only") String username) {
    public String createUsername(@PathVariable("name") @NotBlank @Size(max = 10) String username) {
        return "createUsername, All Pass !!"+ username;
    }
}
