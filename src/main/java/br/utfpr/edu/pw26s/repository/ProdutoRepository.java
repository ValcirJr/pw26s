package br.utfpr.edu.pw26s.repository;

import br.utfpr.edu.pw26s.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
