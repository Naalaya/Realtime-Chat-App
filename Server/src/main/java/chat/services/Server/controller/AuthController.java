package chat.services.Server.controller;

import chat.services.Server.model.Auth;
import chat.services.Server.service.auth.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @Autowired
    private AuthService service;

    @PostMapping("/register")
    public Auth register(@RequestBody Auth user){
        return service.register(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody Auth user){

        return service.verify(user);
    }

}
