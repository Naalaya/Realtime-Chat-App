package chat.services.Server.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class AppController {
    @GetMapping("/")
    public String hello(HttpServletRequest request) {
        return "Hello World " + request.getSession().getId();
    }
}
