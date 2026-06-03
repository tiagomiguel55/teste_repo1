package com.demo.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
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

    @GetMapping("/items/count")
    public int getItemCount() {
        return items.size();
    }

    @PostMapping("/items")
    public String addItem(@RequestBody String item) {
        items.add(item);
        return "Item adicionado: " + item;
    }
}
