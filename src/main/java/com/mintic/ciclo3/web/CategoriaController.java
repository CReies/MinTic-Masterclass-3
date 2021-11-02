package com.mintic.ciclo3.web;

import java.util.List;
import java.util.Optional;

import com.mintic.ciclo3.model.Categoria;
import com.mintic.ciclo3.service.CategoriaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Categoria")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
    RequestMethod.DELETE })
public class CategoriaController {

  @Autowired
  private CategoriaService categoriaService;

  @GetMapping("/all")
  public List<Categoria> getCategorias() {
    return categoriaService.getAll();
  }

  @GetMapping("/{id}")
  public Optional<Categoria> getCategoria(@PathVariable("id") int id) {
    return categoriaService.getCategoria(id);
  }

  @PostMapping("/save")
  @ResponseStatus(HttpStatus.CREATED)
  public Categoria save(@RequestBody Categoria p) {
    return categoriaService.save(p);
  }
}
