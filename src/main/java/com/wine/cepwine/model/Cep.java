package com.wine.cepwine.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="CEP")
public class Cep {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    @Column(nullable = false, length = 255)
    private String codigo_loja;
    @Column(length = 8, nullable = false, unique = true)
    private int faixa_inicio;
    @Column(length = 8, nullable = false, unique = true)
    private int faixa_fim;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCodigo_loja() {
        return codigo_loja;
    }

    public void setCodigo_loja(String codigo_Loja) {
        this.codigo_loja = codigo_Loja;
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
