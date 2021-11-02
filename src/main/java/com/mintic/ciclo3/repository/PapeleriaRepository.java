package com.mintic.ciclo3.repository;

import java.util.List;
import java.util.Optional;

import com.mintic.ciclo3.model.Papeleria;
import com.mintic.ciclo3.repository.crud.PapeleriaCrudRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PapeleriaRepository {
  @Autowired
  private PapeleriaCrudRepository papeleriaCrudRepository;

  public List<Papeleria> getAll() {
    return (List<Papeleria>) papeleriaCrudRepository.findAll();
  }

  public Optional<Papeleria> getPapeleria(int id) {
    return papeleriaCrudRepository.findById(id);
  };

  public Papeleria save(Papeleria p) {
    return papeleriaCrudRepository.save(p);
  }
}
