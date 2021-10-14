package br.utfpr.edu.pw26s.repository;

import br.utfpr.edu.pw26s.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}
