package br.utfpr.edu.pw26s.repository;

import br.utfpr.edu.pw26s.model.Marca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarcaRepository extends JpaRepository<Marca, Long> {
}
