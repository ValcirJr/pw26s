package br.utfpr.edu.pw26s.service.impl;

import br.utfpr.edu.pw26s.model.Marca;
import br.utfpr.edu.pw26s.repository.MarcaRepository;
import br.utfpr.edu.pw26s.service.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class MarcaServiceImpl extends CrudServiceImpl<Marca, Long>
		implements MarcaService {

	@Autowired
	private MarcaRepository marcaRepository;
	
	@Override
	protected JpaRepository<Marca, Long> getRepository() {
		return marcaRepository;
	}

}
