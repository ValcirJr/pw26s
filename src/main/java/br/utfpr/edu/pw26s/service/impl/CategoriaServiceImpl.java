package br.utfpr.edu.pw26s.service.impl;

import br.utfpr.edu.pw26s.model.Categoria;
import br.utfpr.edu.pw26s.repository.CategoriaRepository;
import br.utfpr.edu.pw26s.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl  extends CrudServiceImpl<Categoria, Long>
		implements CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Override
	protected JpaRepository<Categoria, Long> getRepository() {
		return categoriaRepository;
	}

}
