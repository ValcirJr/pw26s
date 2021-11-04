package br.utfpr.edu.pw26s.service.crud;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@Service
public interface CrudService <T, ID extends Serializable>  {

    List<T> findAll();

    Iterable<T> findAll(Sort sort);

    Iterable<T> findAllById(Iterable<ID> ids);

    void flush();

    List<T> saveAll(Iterable<T> entities);

    T saveAndFlush(T entity);

    List<T> saveAllAndFlush(Iterable<T> entities);

    T getById(ID id);

    Page<T> findAll(Pageable pageable);

    T save(T entity);

    Optional<T> findById(ID id);

    boolean existsById(ID id);

    long count();

    void deleteById(ID id);

    void delete(T entity);

    void delete(ID id);

    void deleteAllById(Iterable<ID> ids);

    void deleteAll(Iterable<T> entities);
}
