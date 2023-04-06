package com.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.facade.Facade;
import com.funcionario.Funcionario;

@RestController
@RequestMapping("/api/funcionarios")
@CrossOrigin(origins = "http://localhost:4200")
class FuncionariosAPI {
    @Autowired Facade facade;

    @RequestMapping
    public ResponseEntity<Object> getFuncionarios() {
        Iterable<Funcionario> funcionarios = facade.getAllFuncionarios();
        return ResponseEntity.ok(funcionarios);

    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public ResponseEntity<Object> postFuncionario(@RequestBody Funcionario funcionario) {
        facade.createNewFuncionario(funcionario);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public ResponseEntity<Object> putFuncionario(@RequestBody String cpf, Funcionario funcionario) {
        facade.updateFuncionario(cpf, funcionario);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public ResponseEntity<Object> deleteFuncionario(@RequestBody String cpf) {
        facade.deleteFuncionario(cpf);
        return ResponseEntity.ok().build();
    }
}
