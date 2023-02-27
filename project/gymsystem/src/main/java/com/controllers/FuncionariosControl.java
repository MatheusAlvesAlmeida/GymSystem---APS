package com.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entities.Funcionario;
import com.registers.FuncionarioRegister;

@RestController
class FuncionariosController {

  private final FuncionarioRegister FuncionarioRegister;

  FuncionariosController(FuncionarioRegister  FuncionarioRegister) {
    this.FuncionarioRegister = FuncionarioRegister;
  }


  @PostMapping("/api/Funcionarios")
  void newFuncionario(@RequestBody Funcionario newFuncionario) {
    FuncionarioRegister.addUsuario(newFuncionario);
  }

  // Single item
  
  @GetMapping("/api/Funcionarios/{cpf}")
  Funcionario one(@PathVariable String cpf) {
    
    return FuncionarioRegister.getUsuario(cpf);
  }

  @PutMapping("/api/Funcionarios/{cpf}")
  Funcionario replaceFuncionario(@RequestBody Funcionario newFuncionario, @PathVariable String cpf) {
    
    return FuncionarioRegister.getUsuario(cpf);
  }

  @DeleteMapping("/api/Funcionarios/{cpf}")
  void deleteFuncionario(@PathVariable String cpf) {
    FuncionarioRegister.deleteUsuario(cpf);
  }
}
