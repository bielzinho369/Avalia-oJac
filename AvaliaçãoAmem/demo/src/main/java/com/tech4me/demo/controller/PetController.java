package com.tech4me.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tech4me.demo.model.Pet;
import com.tech4me.demo.service.PetService;



@RestController
@RequestMapping("/petshop")
public class PetController {
  @Autowired
  private PetService servico;
  

  @PostMapping
  public ResponseEntity<Pet> cadastrarPet(@RequestBody Pet pet){
    return new ResponseEntity<>(servico.cadastrar(pet), HttpStatus.CREATED); 
  }

  @GetMapping
  public ResponseEntity<List<Pet>> obterCardapio() {
    return new ResponseEntity<>(servico.obterTodas(), HttpStatus.OK);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Pet> obterPizza(@PathVariable String id) {
    Optional<Pet> retorno = servico.obterPorId(id);

    if (retorno.isPresent()) {
      return new ResponseEntity<>(retorno.get(), HttpStatus.FOUND);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> excluirPet(@PathVariable String id){
    servico.excluirPorId(id);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }

  @PutMapping("/{id}")
  public ResponseEntity<Pet> atualizarPet(@PathVariable String id, @RequestBody Pet pet){
    Optional<Pet> retorno = servico.atualizarPorId(id, pet); 

    if (retorno.isPresent()) {
      return new ResponseEntity<>(retorno.get(), HttpStatus.ACCEPTED);
    } else {
      return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
    }
   
  }
  
}
