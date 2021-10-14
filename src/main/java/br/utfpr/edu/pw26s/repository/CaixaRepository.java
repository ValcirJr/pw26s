package br.utfpr.edu.pw26s.repository;

import br.utfpr.edu.pw26s.model.Caixa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaixaRepository extends JpaRepository<Caixa, Long> {

}
