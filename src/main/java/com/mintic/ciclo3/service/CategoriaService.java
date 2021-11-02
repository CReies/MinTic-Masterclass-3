package com.mintic.ciclo3.service;

import java.util.List;
import java.util.Optional;

import com.mintic.ciclo3.model.Categoria;
import com.mintic.ciclo3.repository.CategoriaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {
  @Autowired
  private CategoriaRepository categoriaRepository;

  public List<Categoria> getAll() {
    return categoriaRepository.getAll();
  }

  public Optional<Categoria> getCategoria(int id) {
    return categoriaRepository.getCategoria(id);
  }

  public Categoria save(Categoria c) {
    if (c.getId() == null) {
      return categoriaRepository.save(c);
    } else {
      Optional<Categoria> caux = categoriaRepository.getCategoria(c.getId());
      if (caux.isEmpty()) {
        return categoriaRepository.save(c);
      } else {
        return c;
      }
    }
  }
}
