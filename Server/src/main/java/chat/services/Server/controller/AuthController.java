package chat.services.Server.controller;

import chat.services.Server.DTO.SignUpRequest;
import chat.services.Server.model.Auth;
import chat.services.Server.service.auth.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @Autowired
    private AuthService authService;


    @PostMapping("/register")
    public String register(@RequestBody SignUpRequest request){
        return authService.register(request);
    }

    @PostMapping("/login")
    public String login(@RequestBody Auth user){
        return authService.verify(user);
    }

}
