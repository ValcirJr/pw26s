package br.utfpr.edu.pw26s.service.crud.impl;

import br.utfpr.edu.pw26s.model.Categoria;
import br.utfpr.edu.pw26s.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl extends CrudServiceImpl<Categoria, Long> {

    @Autowired
    CategoriaRepository repository;

    @Override
    protected JpaRepository<Categoria, Long> getRepository() {
        return this.repository;
    }
}