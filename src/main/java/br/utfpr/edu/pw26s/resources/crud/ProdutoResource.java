package br.utfpr.edu.pw26s.resources.crud;

import br.utfpr.edu.pw26s.model.Produto;
import br.utfpr.edu.pw26s.service.CrudService;
import br.utfpr.edu.pw26s.service.impl.ProdutoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produto")
public class ProdutoResource extends CrudResource<Produto, Long>{

    @Autowired
    private ProdutoServiceImpl produtoService;

    @Override
    protected CrudService<Produto, Long> getService() {
        return produtoService;
    }
}
