package com.example.sanya;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class Controller {

    @Autowired
    private Repo repo;

    @PostMapping(value = "/post")
    public String post(@RequestBody Dto dto) {
        repo.save( Dummy.builder()
                        .age(dto.getAge())
                        .firstName(dto.getFirstName())
                        .lastName(dto.getLastName())
                        .priority(Priority.getPriority(dto.getPriority()))
                        .build());
        return "Success";

    }

    @GetMapping(value = "/get/{id}")
    public Optional<Dummy> get(@PathVariable Long id){
        return repo.findById(id);
    }
}
