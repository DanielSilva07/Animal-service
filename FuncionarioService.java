package com.danielsilva.FuncionarioService.service;

import com.danielsilva.FuncionarioService.entity.Funcionario;
import com.danielsilva.FuncionarioService.repository.FuncionarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {

    private final FuncionarioRepository repository;

    public FuncionarioService(FuncionarioRepository repository) {
        this.repository = repository;
    }

    public Funcionario create(Funcionario funcionario){
      return repository.save(funcionario);
    }

    public List<Funcionario>getAll(){
        return repository.findAll();
    }
}
