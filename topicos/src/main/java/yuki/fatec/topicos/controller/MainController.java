package yuki.fatec.topicos.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class MainController {

    @GetMapping
    public String hello() {
        return "Hello!";
    }
}