package com.findyourhustle.security.core.resources;

import com.findyourhustle.security.core.model.JwtUser;
import com.findyourhustle.security.core.security.JwtGenerator;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
@RequestMapping("/token")
public class TokenController {

    private JwtGenerator jwtGenerator;

    public TokenController(JwtGenerator jwtGenerator) {
        this.jwtGenerator = jwtGenerator;
    }

    @PostMapping
    public RedirectView generate(@RequestBody final JwtUser jwtUser) {
        jwtGenerator.generate(jwtUser);

        return new RedirectView("/users");
    }
}
