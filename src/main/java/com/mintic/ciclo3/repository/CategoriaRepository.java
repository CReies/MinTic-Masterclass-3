package com.mintic.ciclo3.repository;

import java.util.List;
import java.util.Optional;

import com.mintic.ciclo3.model.Categoria;
import com.mintic.ciclo3.repository.crud.CategoriaCrudRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CategoriaRepository {
  @Autowired
  private CategoriaCrudRepository categoriaCrudRepository;

  public List<Categoria> getAll() {
    return (List<Categoria>) categoriaCrudRepository.findAll();
  }

  public Optional<Categoria> getCategoria(int id) {
    return categoriaCrudRepository.findById(id);
  };

  public Categoria save(Categoria p) {
    return categoriaCrudRepository.save(p);
  }
}
