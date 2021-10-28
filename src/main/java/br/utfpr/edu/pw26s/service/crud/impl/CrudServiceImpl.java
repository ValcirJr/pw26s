package br.utfpr.edu.pw26s.service.crud.impl;

import br.utfpr.edu.pw26s.service.crud.CrudService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;


import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class CrudServiceImpl<T, ID extends Serializable> implements CrudService<T, ID> {

    protected abstract JpaRepository<T, ID> getRepository();

    @Override
    public Iterable<T> findAll() {
        return getRepository().findAll();
    }

    @Override
    public Iterable<T> findAll(Sort sort) {
        return getRepository().findAll(sort);
    }

    @Override
    public Iterable<T> findAllById(Iterable<ID> iterable) {
        return getRepository().findAllById(iterable);
    }

    @Override
    public void flush() {
        getRepository().flush();
    }

    @Override
    public List<T> saveAll(Iterable<T> entities) {
        return getRepository().saveAll(entities);
    }

    @Override
    public T saveAndFlush(T entity) {
        return getRepository().saveAndFlush(entity);
    }

    @Override
    public List<T> saveAllAndFlush(Iterable<T> entities) {
        return getRepository().saveAllAndFlush(entities);
    }

    @Override
    public T getById(ID id) {
        return getRepository().getById(id);
    }

    @Override
    public Page<T> findAll(Pageable pageable) {
        return getRepository().findAll(pageable);
    }

    @Override
    public T save(T entity) {
        return getRepository().save(entity);
    }

    @Override
    public Optional<T> findById(ID id) {
        return getRepository().findById(id);
    }

    @Override
    public boolean existsById(ID id) {
        return getRepository().existsById(id);
    }

    @Override
    public long count() {
        return getRepository().count();
    }

    @Override
    public void deleteById(ID id) {
        getRepository().deleteById(id);
    }

    @Override
    public void delete(T entity) {
        getRepository().delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<ID> ids) {
        getRepository().deleteAllById(ids);
    }

    @Override
    public void deleteAll(Iterable<T> entities) {
        getRepository().deleteAll(entities);
    }
}
