package br.utfpr.edu.pw26s.repository;

import br.utfpr.edu.pw26s.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
