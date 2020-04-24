package com.findyourhustle.management.resources;

import com.findyourhustle.management.domain.User;
import com.findyourhustle.management.services.UserService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import javax.validation.Valid;

@RestController
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

    @PostMapping("/users")
    public RedirectView createUser(User user){
        if (user.getEmail() == null || user.getPassword() == null){
//            return HttpStatus.BAD_REQUEST;
        }
        userService.saveUser(user);

        return new RedirectView("/");
    }
}
