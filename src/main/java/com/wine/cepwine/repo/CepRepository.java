package com.wine.cepwine.repo;

import com.wine.cepwine.model.Cep;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CepRepository extends JpaRepository<Cep, Long> {

    @Query("SELECT cep FROM Cep cep" +
            " WHERE cep.faixa_inicio = ?:faixa_inicio AND cep.faixa_fim = :faixa_fim")
    List<Cep> findCepByFaixaInicioAndFaixaFim(@Param(value = "faixa_inicio") int faixa_inicio,
                                              @Param(value = "faixa_fim") int faixa_fim);

    @Query("SELECT cep FROM Cep cep" +
            " WHERE cep.codigo_loja = :codigo_loja")
    List<Cep> findByCodigoLoja(@Param(value = "codigo_loja") String codigo_loja);
}
