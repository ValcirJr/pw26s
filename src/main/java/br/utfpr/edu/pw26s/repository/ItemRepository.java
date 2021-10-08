package br.utfpr.edu.pw26s.repository;

import br.utfpr.edu.pw26s.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
