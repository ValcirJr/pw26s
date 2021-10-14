package br.utfpr.edu.pw26s;

import br.utfpr.edu.pw26s.model.Categoria;
import br.utfpr.edu.pw26s.model.Item;
import br.utfpr.edu.pw26s.model.PedidoItem;
import br.utfpr.edu.pw26s.repository.PedidoItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class teste {

    PedidoItem pedidoItem;

    @Autowired
    PedidoItemRepository pedidoItemRepository;

    void test() {
        pedidoItem = pedidoItemRepository.getById(1l);
    }

    void testDois() {
        //.... lógica
    }
}
