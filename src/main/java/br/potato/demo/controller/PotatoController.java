package br.potato.demo.controller;

import br.potato.demo.model.Potato;
import br.potato.demo.service.PotatoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/potato")
public class PotatoController {

    private final PotatoService potatoService;

    public PotatoController(PotatoService potatoService){
        this.potatoService = potatoService;
    }

    @GetMapping
    public ResponseEntity<List<Potato>> getPotato(){
        return ResponseEntity.status(HttpStatus.OK).body(potatoService.getAllPotatoes());
    }
}
