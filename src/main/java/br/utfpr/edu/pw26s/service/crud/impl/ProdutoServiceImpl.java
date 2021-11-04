package br.utfpr.edu.pw26s.service.crud.impl;

import br.utfpr.edu.pw26s.model.Produto;
import br.utfpr.edu.pw26s.repository.ProdutoRepository;
import br.utfpr.edu.pw26s.service.crud.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ProdutoServiceImpl extends CrudServiceImpl<Produto, Long> implements ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    @Override
    protected JpaRepository<Produto, Long> getRepository() {
        return produtoRepository;
    }
}
