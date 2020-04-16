package com.findyourhustle.management.resources;

import com.findyourhustle.management.domain.User;
import com.findyourhustle.management.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/user-create")
    public String createUserForm(User user){
        if (user != null) {
            userService.saveUser(user);
        }
        return "/user-create";
    }
}
