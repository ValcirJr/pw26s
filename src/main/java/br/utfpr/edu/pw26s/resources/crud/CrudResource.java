package br.utfpr.edu.pw26s.resources.crud;

import br.utfpr.edu.pw26s.service.crud.CrudService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

@RestController
public abstract class CrudResource<T, ID extends Serializable> {

    protected abstract CrudService<T, ID> getService();

    @GetMapping()
    public List<T> findAll() {
        return getService().findAll();
    }

    @GetMapping("page")
    public Page<T> findAll(@RequestParam int page,
                           @RequestParam int size,
                           @RequestParam(required = false) String order,
                           @RequestParam(required = false) Boolean asc) {
        PageRequest pageRequest = PageRequest.of(page, size);

        if(order != null && asc != null)
            pageRequest = PageRequest.of(page, size, asc ? Sort.Direction.ASC: Sort.Direction.DESC, order);

        return getService().findAll(pageRequest);
    }

    @GetMapping("{id}")
    public T findById(@PathVariable ID id) {
        return getService().findById(id).orElse(null);
    }

    @GetMapping("exists/{id}")
    public boolean exists(@PathVariable ID id){
        return getService().existsById(id);
    }

    @GetMapping("count")
    public long count() {
        return getService().count();
    }

    @PostMapping
    public T save(@RequestParam T entity) {
        return getService().save(entity);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable ID id) {
        getService().delete(id);
    }
}
