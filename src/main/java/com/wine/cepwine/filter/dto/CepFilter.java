package com.wine.cepwine.filter.dto;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class CepFilter {

    @NotNull
    private String codigo_loja;
    private int faixa_inicio;
    private int faixa_fim;


    public String getCodigo_loja() {
        return codigo_loja;
    }

    public void setCodigo_loja(String codigo_loja) {
        this.codigo_loja = codigo_loja;
    }

    public int getFaixa_inicio() {
        return faixa_inicio;
    }

    public void setFaixa_inicio(int faixa_inicio) {
        this.faixa_inicio = faixa_inicio;
    }

    public int getFaixa_fim() {
        return faixa_fim;
    }

    public void setFaixa_fim(int faixa_fim) {
        this.faixa_fim = faixa_fim;
    }
}
