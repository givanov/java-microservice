package com.example.restsvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Controller
public class HtmlController {

    private static final String template = "Hello, %s!";
    private final AtomicInteger counter = new AtomicInteger();
    UserDao userDao = new UserDao();

    @GetMapping("/html")
    public String html(@RequestParam(name="name", required=false, defaultValue="test") String name, Model model) {
        List<User> users = userDao.getAllUsers();
        User selectedUser = users.stream().filter(user -> name.equals(user.getName())).findFirst().orElse(new User());
        model.addAttribute("name", selectedUser.getName());
        model.addAttribute("profession", selectedUser.getProfession());
        return "html";
    }
}
