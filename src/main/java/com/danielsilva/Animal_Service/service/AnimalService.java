package com.danielsilva.Animal_Service.service;

import com.danielsilva.Animal_Service.entity.Animal;
import com.danielsilva.Animal_Service.repository.AnimalRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AnimalService {

    private final AnimalRepository repository;

    public AnimalService(AnimalRepository repository) {
        this.repository = repository;
    }



    public Animal create(Animal animal ){
        return repository.save(animal);
    }

    public List<Animal> getAll(){
        return repository.findAll();
    }
}
