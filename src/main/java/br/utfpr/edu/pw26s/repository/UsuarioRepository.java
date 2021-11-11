package br.utfpr.edu.pw26s.repository;


import br.utfpr.edu.pw26s.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	Optional<Usuario> findByUsername(String username);
	
}
