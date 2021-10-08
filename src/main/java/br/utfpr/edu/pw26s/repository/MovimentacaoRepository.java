package br.utfpr.edu.pw26s.repository;

import br.utfpr.edu.pw26s.model.Movimentacao;
import br.utfpr.edu.pw26s.model.enums.TipoMovimentacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Long> {

    List<Movimentacao> findAllByDataBetween(Date dataInicial, Date dataFinal);

    @Query("SELECT m.tipo FROM Movimentacao m")
    List<TipoMovimentacao> findTipoMoviementacaoInMovimentacoes();
}
