package com.danielsilva.FuncionarioService.controller;

import com.danielsilva.FuncionarioService.entity.Funcionario;
import com.danielsilva.FuncionarioService.service.FuncionarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FuncionarioController {

    private final FuncionarioService funcionarioService;

    public FuncionarioController(FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

    @PostMapping("/save")
    public ResponseEntity<Funcionario>create(@RequestBody Funcionario funcionario){
        return ResponseEntity.status(201).body(funcionarioService.create(funcionario));
    }
}
