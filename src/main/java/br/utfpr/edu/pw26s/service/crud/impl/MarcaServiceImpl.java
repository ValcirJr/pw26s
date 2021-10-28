package br.utfpr.edu.pw26s.service.crud.impl;

import br.utfpr.edu.pw26s.model.Marca;
import br.utfpr.edu.pw26s.repository.MarcaRepository;
import br.utfpr.edu.pw26s.service.crud.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public class MarcaServiceImpl extends CrudServiceImpl<Marca, Long> implements MarcaService {

    @Autowired
    MarcaRepository repository;

    @Override
    protected JpaRepository<Marca, Long> getRepository() {
        return this.repository;
    }
}
