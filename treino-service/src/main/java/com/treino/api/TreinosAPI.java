package com.treino.api;

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

import com.treino.model.Treino;
import com.treino.model.TreinoController;

@RestController
@RequestMapping("/api/treinos")
@CrossOrigin(origins = "http://localhost:4200")
public class TreinosAPI {
    @Autowired TreinoController controller;

    @RequestMapping
    public Iterable<Treino> getTreinos() {
        return controller.getAllTreinos();
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public ResponseEntity<Object> postTreino(@RequestBody Treino treino) {
        controller.createNewTreino(treino);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public ResponseEntity<Object> deleteTreino(@RequestBody int id) {
        controller.deleteTreino(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public ResponseEntity<Object> putTreino(@RequestBody int id, Treino treino) {
        controller.updateTreino(id, treino);
        return ResponseEntity.ok().build();
    }
}
