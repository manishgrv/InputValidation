package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.awt.*;

@RestController
public class TestController {
    @RequestMapping(value = "/test", method = RequestMethod.GET, produces = MediaType.ALL_VALUE)
    public String getAllEmployees() {
        return "test done !!";
    }

    @PostMapping("/save")
    public String saveUserData(@Valid @RequestBody User user) {
        return "test done !!";
    }
}
