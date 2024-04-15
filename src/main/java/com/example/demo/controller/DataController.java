package com.example.demo.controller;

import com.example.demo.model.DataEntity;
import com.example.demo.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DataController {

    @Autowired
    private DataRepository repository;

    @GetMapping("/string/{id}")
    public ResponseEntity<String> getStringValue(@PathVariable int id) {
        var data = repository.findByIntValue(id).orElse(null);
        if (data != null) {
            return ResponseEntity.ok(data.getStringValue());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("int/{id}")
    public ResponseEntity<Integer> getIntValue(@PathVariable int id) {
        var data = repository.findByIntValue(id).orElse(null);
        if (data != null) {
            return ResponseEntity.ok(data.getIntValue());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
