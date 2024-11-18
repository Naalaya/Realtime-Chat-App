package chat.services.Server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class AppController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}