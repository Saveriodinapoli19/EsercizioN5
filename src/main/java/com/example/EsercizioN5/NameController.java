package com.example.EsercizioN5;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {"http://localhost:63342"})
public class NameController {
    @GetMapping("/hello")
    public String hello () {
        return "hello";
    }

    @GetMapping("/nome")
    public String getName (@RequestParam String nome) {
        return nome;
    }

    @PostMapping("/nome")
    public String getReverseName (@RequestParam String nome) {
        StringBuilder stringBuilder = new StringBuilder(nome);
        return stringBuilder.reverse().toString();
    }
}