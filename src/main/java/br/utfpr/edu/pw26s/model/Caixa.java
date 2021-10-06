package br.utfpr.edu.pw26s.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Caixa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date dataAbertura;

    private Date dataFechamento;

    @Column(scale = 2)
    private BigDecimal valorTotal;

    @OneToMany(mappedBy = "caixa")
    private List<Movimentacao> movimentacaos;
}
