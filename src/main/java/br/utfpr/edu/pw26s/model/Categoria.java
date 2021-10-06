package br.utfpr.edu.pw26s.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Categoria {

    //generationType.auto -> busca o padrão da unidade de persistencia
    //generationType.IDENTITY -> auto incremnt do bd
    //GenerationType.SEQUENCE -> usa sequencia predefinida em banco, precisa generator
    //GenerationType.TABLE -> usa tabela em banco para controle, precisa generator
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String descricao;

    @OneToMany(mappedBy = "categoria")
    private List<Item> itens;
}
