package br.utfpr.edu.pw26s.service.impl;

import br.utfpr.edu.pw26s.model.Produto;
import br.utfpr.edu.pw26s.repository.ProdutoRepository;
import br.utfpr.edu.pw26s.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ProdutoServiceImpl extends CrudServiceImpl<Produto, Long>
		implements ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Override
	protected JpaRepository<Produto, Long> getRepository() {
		return produtoRepository;
	}

}
