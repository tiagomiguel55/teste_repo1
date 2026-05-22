package com.demo.api;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.ArrayList;

@RestController
@RequestMapping("/api")
public class HelloController {

    private final List<String> items = new ArrayList<>(List.of("Item A", "Item B", "Item C"));

    @GetMapping("/hello")
    public String hello() {
        return "Olá, mundo!";
    }

    @GetMapping("/items")
    public List<String> getItems() {
        return items;
    }

    @PostMapping("/items")
    public String addItem(@RequestBody String item) {
        items.add(item);
        return "Item adicionado: " + item;
    }
}
