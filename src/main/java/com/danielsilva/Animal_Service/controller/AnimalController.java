package com.danielsilva.Animal_Service.controller;
import com.danielsilva.Animal_Service.entity.Animal;
import com.danielsilva.Animal_Service.service.AnimalService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class AnimalController {

    private final AnimalService animalService;


    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;

    }

    @PostMapping("/salvar")
    public ResponseEntity<Animal> create(@RequestBody Animal animal){
        return ResponseEntity.status(201).body(animalService.create(animal));
    }

    @GetMapping("/gg")
    public ResponseEntity<?>getAll(){
        return ResponseEntity.ok().body(animalService.getAll());
    }
}
