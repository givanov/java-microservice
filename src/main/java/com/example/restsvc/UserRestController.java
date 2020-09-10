package com.example.restsvc;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserRestController {

    private static final String template = "Hello, %s!";
    private final AtomicInteger counter = new AtomicInteger();
    UserDao userDao = new UserDao();

    @GetMapping(value="/get-users", produces= MediaType.APPLICATION_XML_VALUE)
    public List<User> getUsers(@RequestParam(value = "name", defaultValue = "test") String name) {
        return userDao.getAllUsers();
    }

    @PostMapping(value="/add-user", produces= MediaType.APPLICATION_XML_VALUE, consumes= MediaType.APPLICATION_XML_VALUE)
    public String addUser(@RequestBody User user) {
        List<User> userlist =  userDao.getAllUsers();
        userlist.add(user);
        userDao.saveUserList(userlist);
        return "ok";
    }

    @DeleteMapping(value="/delete-user", produces= MediaType.APPLICATION_XML_VALUE)
    public String addUser(@RequestParam(value = "name", defaultValue = "") String name) {
        List<User> userlist =  userDao.getAllUsers();
        userlist.removeIf(user -> name.equals(user.getName()));
        userDao.saveUserList(userlist);
        return "ok";
    }
}