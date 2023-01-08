package com.tech4me.demo.service;

import java.util.List;
import java.util.Optional;

import com.tech4me.demo.model.Pet;

  public interface PetService {
    
    public List<Pet> obterTodas();
    public Optional<Pet> obterPorId(String id);
    public void excluirPorId(String id);
    public Pet cadastrar(Pet pet);
    public Optional<Pet> atualizarPorId(String id, Pet pet);






}
