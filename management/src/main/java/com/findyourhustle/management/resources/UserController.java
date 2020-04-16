package com.findyourhustle.management.resources;

import com.findyourhustle.management.domain.User;
import com.findyourhustle.management.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.xml.ws.Response;

@Controller
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/user-create")
    public ResponseEntity<?> createUserForm(User user){
        userService.saveUser(user);
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }


}
