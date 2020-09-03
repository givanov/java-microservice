package com.example.restsvc;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private static final String template = "Hello, %s!";
    private final AtomicInteger counter = new AtomicInteger();
    UserDao userDao = new UserDao();

    @GetMapping(value="/users", produces= MediaType.APPLICATION_XML_VALUE)
    public List<User> getUsers(@RequestParam(value = "name", defaultValue = "World") String name) {
        return userDao.getAllUsers();
    }
}