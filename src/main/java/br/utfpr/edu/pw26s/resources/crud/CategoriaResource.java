package br.utfpr.edu.pw26s.resources.crud;

import br.utfpr.edu.pw26s.model.Categoria;
import br.utfpr.edu.pw26s.service.crud.CrudService;
import br.utfpr.edu.pw26s.service.crud.impl.CategoriaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categoria")
public class CategoriaResource extends CrudResource<Categoria, Long>{

    @Autowired
    private CategoriaServiceImpl categoriaService;

    @Override
    protected CrudService<Categoria, Long> getService() {
        return categoriaService;
    }
}
