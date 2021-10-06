package br.utfpr.edu.pw26s.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(scale = 2)
    private BigDecimal total;

    @OneToMany(mappedBy = "pedido")
    private List<PedidoItem> pedidoItens;
}
