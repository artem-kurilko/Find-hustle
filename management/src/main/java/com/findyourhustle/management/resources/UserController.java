package com.findyourhustle.management.resources;

import com.findyourhustle.management.domain.User;
import com.findyourhustle.management.services.UserService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/me")
    public User getUser(@Valid @RequestBody User user){
        if (user == null){
            try {
                throw new NotFoundException("Not valid user attributes.");
            } catch (NotFoundException e) {
                e.printStackTrace();
            }
        }

        return userService.findById(user.getUserId());
    }

    @PostMapping
    public String createUser(@Valid @RequestBody User user){
        if (user == null){
            try {
                throw new NotFoundException("Not valid user attributes.");
            } catch (NotFoundException e){
                e.printStackTrace();}
        }
        userService.saveUser(user);
        return user.toString();
    }
}
